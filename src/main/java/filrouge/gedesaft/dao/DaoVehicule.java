package filrouge.gedesaft.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import filrouge.gedesaft.model.RepresentationModel;
import filrouge.gedesaft.model.Vehicule;

public class DaoVehicule extends DataDaoImpl {
	
	
	public DaoVehicule(JdbcTemplate jdbcTemplate, DataSource datasource) {
		super(jdbcTemplate);
	}
	
	public List<RepresentationModel> getListRepresentationVehicule(Long id_utilisateur) throws Exception {	
		Long idRecherche = id_utilisateur;
		String idObjectRepresentation = "id_vehicule";
		String nameObjectRepresentation = "typeVehicule";
		String request = "SELECT DISTINCT vehicule.id_vehicule, vehicule.typeVehicule FROM vehicule"
				+ " JOIN affaire_has_vehicule ON vehicule.id_vehicule = affaire_has_vehicule.id_vehicule"
				+ " JOIN affaire ON affaire_has_vehicule.id_affaire = affaire.id_affaire"
				+ " JOIN affaire_has_protagonniste ON affaire.id_affaire = affaire_has_protagonniste.id_affaire"
				+ " JOIN protagonniste ON affaire_has_protagonniste.id_protagonniste = protagonniste.id_protagonniste"
				+ " WHERE protagonniste.id_Protagonniste = ? ";
		return getListRepresentationData(idRecherche, idObjectRepresentation, nameObjectRepresentation, request);
	}

	public Vehicule getVehicule(Long id_vehicule) throws Exception {
		String objectType = "vehicule";
		Long idObject = id_vehicule;
		String request = "SELECT * FROM vehicule WHERE id_vehicule = ?";
		return (Vehicule) getObjectData(objectType, idObject, request);
	}
	
	public List<RepresentationModel> getListRepresentationAffaireOfVehicule(Long id_vehicule) throws Exception {	
		Long idRecherche = id_vehicule;
		String idAffaireRepresentation = "id_affaire";
		String nameAffaireRepresentation = "nomAffaire";
		String request = "SELECT DISTINCT affaire.id_affaire, nomAffaire FROM affaire"
				+ " JOIN affaire_has_vehicule ON affaire.id_affaire = affaire_has_vehicule.id_affaire"
				+ " JOIN vehicule ON affaire_has_vehicule.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListRepresentationData(idRecherche, idAffaireRepresentation, nameAffaireRepresentation, request);
	}
	
	public List<RepresentationModel> getListRepresentationADNOfVehicule(Long id_vehicule) throws Exception {
		Long idRecherche = id_vehicule;
		String idADNRepresentation = "id_ADN";
		String nameADNRepresentation = "nomADN";
		String request = "SELECT DISTINCT adn.id_ADN, nomADN FROM adn"
				+ " JOIN vehicule_has_adn ON adn.id_ADN = vehicule_has_adn.id_adn"
				+ " JOIN vehicule ON vehicule_has_adn.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListRepresentationData(idRecherche, idADNRepresentation, nameADNRepresentation, request);
	}
	
	public List<RepresentationModel> getListRepresentationEmpreinteOfVehicule(Long id_vehicule) throws Exception {
		Long idRecherche = id_vehicule;
		String idEmpreinteRepresentation = "id_empreintes";
		String nameEmpreinteRepresentation = "nomEmpreintes";
		String request = "SELECT DISTINCT empreintes.id_empreintes, nomEmpreintes FROM empreintes"
				+ " JOIN vehicule_has_empreintes ON empreintes.id_empreintes = vehicule_has_empreintes.id_empreintes"
				+ " JOIN vehicule ON vehicule_has_empreintes.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListRepresentationData(idRecherche, idEmpreinteRepresentation, nameEmpreinteRepresentation, request);
	}

	public List<RepresentationModel> getListRepresentationProtagonnisteOfVehicule(Long id_vehicule) throws Exception {
		Long idRecherche = id_vehicule;
		String idProtagonnisteRepresentation = "id_protagonniste";
		String nameProtagonnisteRepresentation = "nomProtagonniste";
		String request = "SELECT DISTINCT protagonniste.id_protagonniste, nomProtagonniste FROM protagonniste"
				+ " JOIN protagonniste_has_vehicule ON protagonniste.id_protagonniste = protagonniste_has_vehicule.id_protagonniste"
				+ " JOIN vehicule on protagonniste_has_vehicule.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListRepresentationData(idRecherche, idProtagonnisteRepresentation, nameProtagonnisteRepresentation, request);
	}

}
