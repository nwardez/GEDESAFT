package filrouge.gedesaft.model;

import java.util.List;

public class VehiculeModel {
	
	private Long id_vehicule;
	private String typeVehicule;
	private String marqueVehicule;
	private String modeleVehicule;
	private String immatriculationVehicule;
	private String couleurVehicule;
	private List<String> protagonnisteVehicule;
	private List<String> listAffaireVehicule;
	private List<String> listEmpreinteVehicule;
	private List<String> listAdnVehicule;
	
	public VehiculeModel () {
		super();
	}

	public Long getId_vehicule() {
		return id_vehicule;
	}

	public void setId_vehicule(Long id_vehicle) {
		this.id_vehicule = id_vehicle;
	}

	public String getTypeVehicule() {
		return typeVehicule;
	}

	public void setTypeVehicule(String typeVehicule) {
		this.typeVehicule = typeVehicule;
	}

	public String getMarqueVehicule() {
		return marqueVehicule;
	}

	public void setMarqueVehicule(String marqueVehicule) {
		this.marqueVehicule = marqueVehicule;
	}

	public String getModeleVehicule() {
		return modeleVehicule;
	}

	public void setModeleVehicule(String modeleVehicule) {
		this.modeleVehicule = modeleVehicule;
	}

	public String getImmatriculationVehicule() {
		return immatriculationVehicule;
	}

	public void setImmatriculationVehicule(String immatriculationVehicule) {
		this.immatriculationVehicule = immatriculationVehicule;
	}

	public String getCouleurVehicule() {
		return couleurVehicule;
	}

	public void setCouleurVehicule(String couleurVehicule) {
		this.couleurVehicule = couleurVehicule;
	}

	public List<String> getListAffairesVehicule() {
		return listAffaireVehicule;
	}

	public void setListAffairesVehicule(List<String> listAffaireVehicule) {
		this.listAffaireVehicule = listAffaireVehicule;
	}

	public List<String> getListEmpreintesVehicule() {
		return listEmpreinteVehicule;
	}

	public void setListEmpreintesVehicule(List<String> listEmpreinteVehicule) {
		this.listEmpreinteVehicule = listEmpreinteVehicule;
	}

	public List<String> getListAdnVehicule() {
		return listAdnVehicule;
	}

	public void setListAdnVehicule(List<String> listAdnVehicule) {
		this.listAdnVehicule = listAdnVehicule;
	};
	
	public List<String> getProtagonnisteVehicule() {
		return protagonnisteVehicule;
	}
	
	public void setProtagonnisteVehicule(List<String> protagonnisteVehicule) {
		this.protagonnisteVehicule = protagonnisteVehicule;
	}
	
}
