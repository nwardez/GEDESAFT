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

	public List<AffichageModel> getListAffichage(String utilisateur) throws Exception {
		return dao.listAffichage(utilisateur);
	}
	
	public VehiculeModel getVehicule(Long id) throws Exception {
	return dao.getData(id);
	}
	
}
