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

	/**
	 * @param id_utilisateur
	 * @return
	 * @throws Exception
	 */
	public List<AffichageModel> listAffichageVehicule(Long id_utilisateur) throws Exception {	
		List <AffichageModel> listAffichageVehicule;
		Long idRecherche = id_utilisateur;
		String id_colonne = "id_vehicule";
		String name_colonne = "typeVehicule";
		String request = "SELECT DISTINCT vehicule.id_vehicule, vehicule.typeVehicule FROM vehicule"
				+ " JOIN affaire_has_vehicule ON vehicule.id_vehicule = affaire_has_vehicule.id_vehicule"
				+ " JOIN affaire ON affaire_has_vehicule.id_affaire = affaire.id_affaire"
				+ " JOIN affaire_has_protagonniste ON affaire.id_affaire = affaire_has_protagonniste.id_affaire"
				+ " JOIN protagonniste ON affaire_has_protagonniste.id_protagonniste = protagonniste.id_protagonniste"
				+ " WHERE protagonniste.id_Protagonniste = ? ";
		listAffichageVehicule = listAffichage(idRecherche, id_colonne, name_colonne, request);
		return listAffichageVehicule;
	}	
	
	/**
	 * @param id_utilisateur
	 * @return
	 * @throws Exception
	 */
	public List<AffichageModel> listAffichage(
			Long idRecherche, String id_colonne, String name_colonne, String request)
			throws Exception {
		AffichageModel affichage;
		PreparedStatement pstmt = null;
		ResultSet rs;
		List<AffichageModel> aListOfAffichage = new ArrayList<AffichageModel>();
		try {
			pstmt = datasource.getConnection().prepareStatement(request);
			pstmt.setLong(1, idRecherche);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				affichage = getAffichageFromResultSet(rs, id_colonne, name_colonne);				
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
	
	/**
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	private AffichageModel getAffichageFromResultSet (ResultSet rs, String id_colonne, String name_colonne) throws Exception {
		AffichageModel affichage = new AffichageModel();
		affichage.setId(rs.getLong(id_colonne));
		affichage.setName(rs.getString(name_colonne));
		return affichage;
	}

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public VehiculeModel getData(Long id) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql;
		VehiculeModel vehicule = null;
		try {
			sql = "SELECT * FROM vehicule WHERE id_vehicule = ?";
			pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
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

	/**
	 * @param rs
	 * @param id
	 * @return
	 * @throws Exception
	 */
	private VehiculeModel getVehiculeFromResultSet(ResultSet rs, Long id) throws Exception {
		VehiculeModel vehicule = new VehiculeModel();
		String requestAffaire = "SELECT DISTINCT affaire.id_affaire, nomAffaire FROM affaire"
				+ " JOIN affaire_has_vehicule ON affaire.id_affaire = affaire_has_vehicule.id_affaire"
				+ " JOIN vehicule ON affaire_has_vehicule.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		String requestADN = "SELECT DISTINCT adn.id_ADN, nomADN FROM adn"
				+ " JOIN vehicule_has_adn ON adn.id_ADN = vehicule_has_adn.id_adn"
				+ " JOIN vehicule ON vehicule_has_adn.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		String requestEmpreinte = "SELECT DISTINCT empreintes.id_empreintes, nomEmpreintes FROM empreintes"
				+ " JOIN vehicule_has_empreintes ON empreintes.id_empreintes = vehicule_has_empreintes.id_empreintes"
				+ " JOIN vehicule ON vehicule_has_empreintes.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		String requestProtagonniste = "SELECT DISTINCT protagonniste.id_protagonniste, nomProtagonniste FROM protagonniste"
				+ " JOIN vehicule ON protagonniste.id_protagonniste = vehicule.id_protagonniste"
				+ " WHERE vehicule.id_vehicule = ?";
		vehicule.setId_vehicule(rs.getLong("id_vehicule"));
		vehicule.setTypeVehicule(rs.getString("typevehicule"));
		vehicule.setMarqueVehicule(rs.getString("marquevehicule"));
		vehicule.setModeleVehicule(rs.getString("modeleVehicule"));
		vehicule.setCouleurVehicule(rs.getString("couleurVehicule"));
		vehicule.setImmatriculationVehicule(rs.getString("immatriculationVehicule"));
		vehicule.setProtagonnisteVehicule(listAffichage(id, "id_protagonniste", "nomProtagonniste", requestProtagonniste));
		vehicule.setListAffaireVehicule(listAffichage(id, "id_affaire", "nomAffaire", requestAffaire));
		vehicule.setListAdnVehicule(listAffichage(id, "id_adn", "nomADN", requestADN));
		vehicule.setListEmpreinteVehicule(listAffichage(id, "id_empreintes", "nomEmpreintes", requestEmpreinte));
		return vehicule;
	}
	
	/**
	 * @param pstmt
	 */
	private void logSQL(PreparedStatement pstmt) {
		String sql;
		if (pstmt == null)
			return;
		sql = pstmt.toString().substring(pstmt.toString().indexOf(":") + 2);
		log.debug(sql);
	}

}
