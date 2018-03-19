package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.DaoVehicule;
import filrouge.gedesaft.model.RepresentationModel;
import filrouge.gedesaft.model.Vehicule;

@Service
public class VehiculeController {

	@Autowired
	private DaoVehicule dao;

	public List<RepresentationModel> getListVehiculeButton(Long id_utilisateur) throws Exception {
		return dao.getListRepresentationVehicule(id_utilisateur);
	}
	
	public Vehicule getVehiculeDetail(Long id_vehicule) throws Exception {
		Vehicule vehicule = dao.getVehicule(id_vehicule);
		vehicule.setListAffaireVehicule(dao.getListRepresentationAffaireOfVehicule(id_vehicule));
		vehicule.setListAdnVehicule(dao.getListRepresentationADNOfVehicule(id_vehicule));
		vehicule.setListEmpreinteVehicule(dao.getListRepresentationEmpreinteOfVehicule(id_vehicule));
		vehicule.setListProtagonnisteVehicule(dao.getListRepresentationProtagonnisteOfVehicule(id_vehicule));
		return vehicule;
	}
}
