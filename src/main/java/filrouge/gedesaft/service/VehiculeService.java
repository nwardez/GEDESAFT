package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.VehiculeDAO;
import filrouge.gedesaft.model.AffichageModel;
import filrouge.gedesaft.model.VehiculeModel;

@Service
public class VehiculeService {

	@Autowired
	private VehiculeDAO dao;

	/**
	 * @param id_utilisateur
	 * @return 
	 * @throws Exception
	 */
	public List<AffichageModel> getListAffichage(Long id_utilisateur) throws Exception {
		return dao.listAffichageVehicule(id_utilisateur);
	}

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public VehiculeModel getVehicule(Long id) throws Exception {
	return dao.getData(id);
	}
	
}
