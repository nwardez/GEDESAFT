package filrouge.gedesaft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import filrouge.gedesaft.model.AffichageModel;
import filrouge.gedesaft.service.VehiculeService;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {
	
	@Autowired
	private VehiculeService vehiculeService;
	
	@RequestMapping(value = "/liste_vehicules", method = RequestMethod.GET)
	public ResponseEntity<?> getListAfichage(){
		List<AffichageModel> listeAffichage;
		try {
			listeAffichage = vehiculeService.getListAffichage();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(listeAffichage);
	}
	

}
