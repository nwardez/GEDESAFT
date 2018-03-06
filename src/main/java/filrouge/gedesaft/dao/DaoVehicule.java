package filrouge.gedesaft.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import filrouge.gedesaft.model.ButtonModel;
import filrouge.gedesaft.model.Vehicule;

public class DaoVehicule extends DataDaoImpl {
	
	
	public DaoVehicule(JdbcTemplate jdbcTemplate, DataSource datasource) {
		super(jdbcTemplate);
	}
	
	public List<ButtonModel> getListButtonVehicule(Long id_utilisateur) throws Exception {	
		Long idRecherche = id_utilisateur;
		String idObjectButton = "id_vehicule";
		String nameObjectButton = "typeVehicule";
		String request = "SELECT DISTINCT vehicule.id_vehicule, vehicule.typeVehicule FROM vehicule"
				+ " JOIN affaire_has_vehicule ON vehicule.id_vehicule = affaire_has_vehicule.id_vehicule"
				+ " JOIN affaire ON affaire_has_vehicule.id_affaire = affaire.id_affaire"
				+ " JOIN affaire_has_protagonniste ON affaire.id_affaire = affaire_has_protagonniste.id_affaire"
				+ " JOIN protagonniste ON affaire_has_protagonniste.id_protagonniste = protagonniste.id_protagonniste"
				+ " WHERE protagonniste.id_Protagonniste = ? ";
		return getListButtonData(idRecherche, idObjectButton, nameObjectButton, request);
	}

	public Vehicule getVehicule(Long id_vehicule) throws Exception {
		String objectType = "vehicule";
		Long idObject = id_vehicule;
		String request = "SELECT * FROM vehicule WHERE id_vehicule = ?";
		return (Vehicule) getObjectData(objectType, idObject, request);
	}
	
	public List<ButtonModel> getListButtonAffaireOfVehicule(Long id_vehicule) throws Exception {	
		Long idRecherche = id_vehicule;
		String idAffaireButton = "id_affaire";
		String nameAffaireButton = "nomAffaire";
		String request = "SELECT DISTINCT affaire.id_affaire, nomAffaire FROM affaire"
				+ " JOIN affaire_has_vehicule ON affaire.id_affaire = affaire_has_vehicule.id_affaire"
				+ " JOIN vehicule ON affaire_has_vehicule.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListButtonData(idRecherche, idAffaireButton, nameAffaireButton, request);
	}
	
	public List<ButtonModel> getListButtonADNOfVehicule(Long id_vehicule) throws Exception {
		Long idRecherche = id_vehicule;
		String idADNButton = "id_ADN";
		String nameADNButton = "nomADN";
		String request = "SELECT DISTINCT adn.id_ADN, nomADN FROM adn"
				+ " JOIN vehicule_has_adn ON adn.id_ADN = vehicule_has_adn.id_adn"
				+ " JOIN vehicule ON vehicule_has_adn.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListButtonData(idRecherche, idADNButton, nameADNButton, request);
	}
	
	public List<ButtonModel> getListButtonEmpreinteOfVehicule(Long id_vehicule) throws Exception {
		Long idRecherche = id_vehicule;
		String idEmpreinteButton = "id_empreintes";
		String nameEmpreinteButton = "nomEmpreintes";
		String request = "SELECT DISTINCT empreintes.id_empreintes, nomEmpreintes FROM empreintes"
				+ " JOIN vehicule_has_empreintes ON empreintes.id_empreintes = vehicule_has_empreintes.id_empreintes"
				+ " JOIN vehicule ON vehicule_has_empreintes.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListButtonData(idRecherche, idEmpreinteButton, nameEmpreinteButton, request);
	}

	public List<ButtonModel> getListButtonProtagonnisteOfVehicule(Long id_vehicule) throws Exception {
		Long idRecherche = id_vehicule;
		String idProtagonnisteButton = "id_protagonniste";
		String nameProtagonnisteButton = "nomProtagonniste";
		String request = "SELECT DISTINCT protagonniste.id_protagonniste, nomProtagonniste FROM protagonniste"
				+ " JOIN protagonniste_has_vehicule ON protagonniste.id_protagonniste = protagonniste_has_vehicule.id_protagonniste"
				+ " JOIN vehicule on protagonniste_has_vehicule.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListButtonData(idRecherche, idProtagonnisteButton, nameProtagonnisteButton, request);
	}

}
