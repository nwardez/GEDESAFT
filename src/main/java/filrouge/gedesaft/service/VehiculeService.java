package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.VehiculeDAO;
import filrouge.gedesaft.model.AffichageModel;
import filrouge.gedesaft.model.VehiculeModel;

@Service
public class VehiculeService {

//	On cree une instance de la classe VehiculeDAO nomme dao
//	Cette instanciation necessite la configuration d'une base de donnee
//	Cette configuration ce fait au niveau de la classe VehiculeDAO (via l'annotation @Repository)
//	L'annotation @Autowired permet d'instancier une classe sans ecrire le new
//	(VehiculeDAO dao = new VehiculeDAO() habituellement).	
//	Cette instanciation se fait via l'annotation @Autowired
//	L'annotation va diractement cheche la configuration necessaire pour l'instanciation,
//	ici la configuration de base de donnee generer par l'annotion @Repository de la classe VehiculeDAO)
	@Autowired
	private VehiculeDAO dao;

//	Cette methode sert a recuperer une liste d'instance d'objets de type AfficheModel
//	(couple de id_vehicule et de typeVéhicule issus de la table vehicule de la base de donnees)
//	generee par la méthode listAffichage() de la classe VehiculeDAO
//	Elle prend l'id de l'utilisateur en paramètre.
	/**
	 * @param id_utilisateur
	 * @return 
	 * @throws Exception
	 */
	public List<AffichageModel> getListAffichage(Long id_utilisateur) throws Exception {
		return dao.listAffichage(id_utilisateur);
	}

// Cette methode sert a recuperer l'instance d'un objet de type VehiculeModel (tous les détails d'une voiture)
// generee par la methode getData de la classe VehiculeDAO
	/**
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public VehiculeModel getVehicule(Long id) throws Exception {
	return dao.getData(id);
	}
	
}
