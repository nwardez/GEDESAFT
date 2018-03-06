package filrouge.gedesaft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import filrouge.gedesaft.model.ButtonModel;
import filrouge.gedesaft.model.Vehicule;
import filrouge.gedesaft.service.VehiculeService;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

	Long id_utilisateur = (long) 7;
	
	@Autowired
	private VehiculeService vehiculeService;

	/**
	 * @return
	 */
	@RequestMapping(value = "/liste_vehicules", method = RequestMethod.GET)
	public ResponseEntity<?> getListVehiculeButton(){
		List<ButtonModel> listButtonName = null; 
		try {
			listButtonName = vehiculeService.getListVehiculeButton(id_utilisateur);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(listButtonName);
	}

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value= "/detail/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getVehiculeDetail(@PathVariable Long id) {
		Vehicule vehicule = null;
		try {
			vehicule = vehiculeService.getVehiculeDetail(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(vehicule);
	}
}
