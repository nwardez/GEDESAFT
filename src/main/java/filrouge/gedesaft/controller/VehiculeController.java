package filrouge.gedesaft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import filrouge.gedesaft.model.AffichageModel;
import filrouge.gedesaft.model.VehiculeModel;
import filrouge.gedesaft.service.VehiculeService;

//	@RestController indique que la classe VehiculeController est une classe de type controller
//	et donc que certaines annotations y sont utilisables, dont:
//	@RequestMapping qui indique les url auxquelle cette classe va répondre:
//	url-serveur(chez nous localhost:8080)/véhicule...
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

//	Ligne pour simuler un utilisateur
//	Normalement, 7 est de type int, mais les id sont, dans le programme, de type Long.
//	Donc on cast (on force) le type de 7 en Long avec le (long) devant le 7.
	Long id_utilisateur = (long) 7;
	
//	On instancie la classe ObjectService.
//	Cette instance un attribut de type VehiculeDAO qui nécessite, pour etre instancie, de configurer
//	une base de donnees: ce qui se fait via l'annotation @Repository de la classe VehiculeDAO.
//	L'annotation @Autowired indique donc d'instancier VehiculeService en utilisant la classe de configuration
//	appropriee (ici VehiculeDAO et son annotation @Repository).
	@Autowired
	private VehiculeService vehiculeService;

//	Quand le front/navigateur (client) fait une requete de type GET
//	(il appelle une ressource au serveur, ici du contenu à afficher)
//	à l'url localhost:8080/vehicule/liste_vehicules, cela déclenche la methode getListForButtonList()
//	qui gere la reponse a la requete
//	Dans une classe décoree avec @Controller ou @restController, TOUTES les methodes de cette classe
//	retournent une instance de la classe ResponseEntity qui a les attributs
//	status, qui est le code numerique de la reponse a l'appel du client
//	et body, qui est une instance d'une classe indeterminee (d'ou le <?>)
//	qui forme le corps de la reponse à la requete GET
//	(ce corps contient la ressource que le serveur renvoie au client)
	/**
	 * @return
	 */
	@RequestMapping(value = "/liste_vehicules", method = RequestMethod.GET)
	public ResponseEntity<?> getListForButtonList(){
//	Instanciation d'une liste d'instances de la classe AfichageModel, mais cette instance est nulle
		List<AffichageModel> listeAffichage;
//	On tente de faire quelque chose (try { }).
//	Ce quelque chose, c'est de remplir notre instance listAffichage de la classe AffichageModel
//	en appliquant à l'instance vehiculeService de la classe VehiculeService cree avec le @Autowired
//	la methode getListAfichage() que possède la classe VehiculeService 
		try {
			listeAffichage = vehiculeService.getListAffichage(id_utilisateur);
//	Si l'action tentee dans le try { } provoque une erreur (Exception)
//	- typiquement la connexion avec la base de donnees echoue -
//	alors on fait ce qui est decrit dans le catch { }.
//	Ici, dans le catch, on renvoie une instance de la classe ResponseEntity dont:
//	l'attribut status aura la valeur correspondant à la valeur 404
//	(404 est la valeur correspondant a NOT_FOUND dans l'enum HttpStatus ( .HttpStatus.NOT_FOUND )
//	et l'attribut body n'aura aucune valeur ( .body(null))
//	Il n'est donc renvoye aucune ressource en reponse a la requete GET
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
//	Si l'action du try { } se deroule correctement, on renvoie une instance de la classeResponseEntity avec:
//	un attribut status qui aura la valeur 200 (le OK dans l'enum HttpStatus)
//	et dont le body contiendra l'instance listeAffichage
//	de la classe ListeAffichage qui a ete remplie dans le try { }
//	et qui est donc envoyee au client en remponse a la requete GET
		return ResponseEntity.status(HttpStatus.OK).body(listeAffichage);
	}

//	Exactement le meme fonctionnement, mais cette fois ci:
//	la requete GET se fait à l'une des url localhost:8080/vehicule/detail/(une variable nommee id)
//	la requete, si elle reussit,  renverra via l'instance de la classe ResponseEntity
//	une ressource au client qui sera une instance de la classe VehiculeModel.
//	La methode d'instanciation de VehiculeModel, qui appartient à la classe VehiculeService
//	a besoin d'une variable de type Long comme paramètre
//	Cette variable correspond a l'id_vehicule du vehicule qu'on veut instancier
//	La valeur de cet id nous est fourni par l'url qui recoit la requete GET:
//	c'est la fameuse variable {id} du @RequestMapping.
//	On donne la valeur de cette variable à la variable id donnee en parametre a la methode getVehicule()
//	Pour ca, on utilise l'annotation @PathVeriable
//	La variable precedee de l'annotation @PathVariable prendra comme valeur
//	la variable ecrite entre { } dans la path du @RequestMapping.
//	Les noms de la variable decoree avec @PathVariable et de la variable dans le path du @ResquestMapping
//	doivent être identiques.
	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value= "/detail/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getVehicule(@PathVariable Long id) {
		VehiculeModel vehicule;
		try {
			vehicule = vehiculeService.getVehicule(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(vehicule);
	}
}
