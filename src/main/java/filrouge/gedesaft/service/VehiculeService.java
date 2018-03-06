package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.DaoVehicule;
import filrouge.gedesaft.model.ButtonModel;
import filrouge.gedesaft.model.Vehicule;

@Service
public class VehiculeService {

	@Autowired
	private DaoVehicule dao;

	public List<ButtonModel> getListVehiculeButton(Long id_utilisateur) throws Exception {
		return dao.getListButtonVehicule(id_utilisateur);
	}
	
	public Vehicule getVehiculeDetail(Long id_vehicule) throws Exception {
		Vehicule vehicule = dao.getVehicule(id_vehicule);
		vehicule.setListAffaireVehicule(dao.getListButtonAffaireOfVehicule(id_vehicule));
		vehicule.setListAdnVehicule(dao.getListButtonADNOfVehicule(id_vehicule));
		vehicule.setListEmpreinteVehicule(dao.getListButtonEmpreinteOfVehicule(id_vehicule));
		vehicule.setListProtagonnisteVehicule(dao.getListButtonProtagonnisteOfVehicule(id_vehicule));
		return vehicule;
	}
}
