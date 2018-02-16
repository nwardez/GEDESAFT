package filrouge.gedesaft.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import filrouge.gedesaft.model.AffichageModel;
import filrouge.gedesaft.model.VehiculeModel;

@Repository
public class VehiculeDAO implements DataInterfaceDAO {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private DataSource datasource;
	
	@Autowired
	public VehiculeDAO(JdbcTemplate jdbcTemplate) {
		this.datasource = jdbcTemplate.getDataSource();
	}
	
	private List<String> listName(String request, String colonne, Long id) throws Exception {
		String elementList;
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql;
		List<String> list = new ArrayList<String>();
		
		try {
			sql = request;
			pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id);
			
			logSQL(pstmt);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				elementList = rs.getString(colonne);
				list.add(elementList);
			}
			
		} catch (Exception e) {
			e.printStackTrace();			
			log.error("SQL Eror!:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return list;
	}

	public VehiculeModel getData(Long id) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql;
		VehiculeModel vehicule = null;
		

		try {
			// Prepare the SQL query
			sql = "SELECT * FROM vehicule WHERE id_vehicule = ?";
			pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id);
			
			// Log info
			logSQL(pstmt);

			// Run the query
			rs = pstmt.executeQuery();

			// Handle the query results
			if (rs.next())
				vehicule = getVehiculeFromResultSet(rs, id);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}

		return vehicule;
	}
	
	private VehiculeModel getVehiculeFromResultSet(ResultSet rs, Long id) throws Exception {
		VehiculeModel vehicule = new VehiculeModel();
		String requestAffaire = "SELECT DISTINCT nomAffaire FROM affaire"
				+ " JOIN affaire_has_vehicule ON affaire.id_affaire = affaire_has_vehicule.id_affaire"
				+ " JOIN vehicule ON affaire_has_vehicule.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		String requestADN = "SELECT DISTINCT nomADN FROM adn"
				+ " JOIN vehicule_has_adn ON adn.id_ADN = vehicule_has_adn.id_adn"
				+ " JOIN vehicule ON vehicule_has_adn.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		String requestEmpreinte = "SELECT DISTINCT nomEmpreintes FROM empreintes"
				+ " JOIN vehicule_has_empreintes ON empreintes.id_empreintes = vehicule_has_empreintes.id_empreintes"
				+ " JOIN vehicule ON vehicule_has_empreintes.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		String requestProtagonniste = "SELECT DISTINCT nomProtagonniste FROM protagonniste"
				+ " JOIN vehicule ON protagonniste.id_protagonniste = vehicule.id_protagonniste"
				+ " WHERE vehicule.id_vehicule = ?";
		vehicule.setId_vehicule(rs.getLong("id_vehicule"));
		vehicule.setTypeVehicule(rs.getString("typevehicule"));
		vehicule.setMarqueVehicule(rs.getString("marquevehicule"));
		vehicule.setModeleVehicule(rs.getString("modeleVehicule"));
		vehicule.setCouleurVehicule(rs.getString("couleurVehicule"));
		vehicule.setImmatriculationVehicule(rs.getString("immatriculationVehicule"));
		vehicule.setProtagonnisteVehicule(listName(requestProtagonniste, "nomProtagonniste", id));
		vehicule.setListAffairesVehicule(listName(requestAffaire, "nomAffaire", id));
		vehicule.setListAdnVehicule(listName(requestADN, "nomADN", id));
		vehicule.setListEmpreintesVehicule(listName(requestEmpreinte, "nomEmpreintes", id));
		return vehicule;
	}
	
	public List<AffichageModel> listAffichage(Long id_utilisateur) throws Exception {
		AffichageModel affichage;
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql;
		List<AffichageModel> aListOfAffichage = new ArrayList<AffichageModel>();

		try {
			// Prepare the SQL query
			sql = "SELECT DISTINCT vehicule.id_vehicule, vehicule.typeVehicule FROM vehicule"
					+ " JOIN affaire_has_vehicule ON vehicule.id_vehicule = affaire_has_vehicule.id_vehicule"
					+ " JOIN affaire ON affaire_has_vehicule.id_affaire = affaire.id_affaire"
					+ " JOIN affaire_has_protagonniste ON affaire.id_affaire = affaire_has_protagonniste.id_affaire"
					+ " JOIN protagonniste ON affaire_has_protagonniste.id_protagonniste = protagonniste.id_protagonniste"
					+ " WHERE protagonniste.id_Protagonniste = ? ";
			pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id_utilisateur);
			
			// Log info
			logSQL(pstmt);

			// Run the query
			rs = pstmt.executeQuery();

			// Handle the query results
			while (rs.next()) {
				affichage = getAffichageFromResultSet(rs);
				aListOfAffichage.add(affichage);
			}

		} catch (Exception e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}

		return aListOfAffichage;
	}
	private AffichageModel getAffichageFromResultSet (ResultSet rs) throws Exception {
		AffichageModel affichage = new AffichageModel();
		affichage.setId(rs.getLong("id_vehicule"));
		affichage.setName(rs.getString("typeVehicule"));
		return affichage;
	}

	/**
	 * Debug function used to log information on the database requests
	 * @param pstmt : The PreparedStatement.
	 */
	private void logSQL(PreparedStatement pstmt) {
		String sql;
		
		if (pstmt == null)
			return;
		
		sql = pstmt.toString().substring(pstmt.toString().indexOf(":") + 2);
		log.debug(sql);
	}

}
