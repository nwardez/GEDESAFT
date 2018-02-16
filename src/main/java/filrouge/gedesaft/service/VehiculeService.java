package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.VehiculeDAO;
import filrouge.gedesaft.model.AffichageModel;

@Service
public class VehiculeService {
	
	@Autowired
	private VehiculeDAO dao;
	
//	public List<VehiculeModel> getAllVehicle() throws Exception {
//		return dao.listData();
//	}

	public List<AffichageModel> getListAffichage(String utilisateur) throws Exception {
		return dao.listAffichage(utilisateur);
	}
}
