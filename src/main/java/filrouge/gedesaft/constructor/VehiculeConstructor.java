package filrouge.gedesaft.constructor;

import org.springframework.beans.factory.annotation.Autowired;

import filrouge.gedesaft.dao.DaoVehicule;

import filrouge.gedesaft.model.Vehicule;

public class VehiculeConstructor {

	@Autowired
	private DaoVehicule dao;
	
	private Vehicule getHalfVehicule(Long id_vehicule) throws Exception {
		return dao.getVehicule(id_vehicule);
		}
	
	public Vehicule getVehicule(Long id_vehicule) throws Exception {
		Vehicule vehicule = getHalfVehicule(id_vehicule);
		return vehicule;
	}
	
}
