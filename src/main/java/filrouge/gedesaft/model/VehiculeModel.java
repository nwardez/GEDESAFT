package filrouge.gedesaft.model;

import java.util.List;

public class VehiculeModel {
	
	private Long id_vehicule;
	private String typeVehicule;
	private String marqueVehicule;
	private String modeleVehicule;
	private String immatriculationVehicule;
	private String couleurVehicule;
	private List<AffichageModel> protagonnisteVehicule;
	private List<AffichageModel> listAffaireVehicule;
	private List<AffichageModel> listEmpreinteVehicule;
	private List<AffichageModel> listAdnVehicule;
	
	public VehiculeModel () {
		super();
	}

	public Long getId_vehicule() {
		return id_vehicule;
	}

	public void setId_vehicule(Long id_vehicule) {
		this.id_vehicule = id_vehicule;
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

	public List<AffichageModel> getProtagonnisteVehicule() {
		return protagonnisteVehicule;
	}

	public void setProtagonnisteVehicule(List<AffichageModel> protagonnisteVehicule) {
		this.protagonnisteVehicule = protagonnisteVehicule;
	}

	public List<AffichageModel> getListAffaireVehicule() {
		return listAffaireVehicule;
	}

	public void setListAffaireVehicule(List<AffichageModel> listAffaireVehicule) {
		this.listAffaireVehicule = listAffaireVehicule;
	}

	public List<AffichageModel> getListEmpreinteVehicule() {
		return listEmpreinteVehicule;
	}

	public void setListEmpreinteVehicule(List<AffichageModel> listEmpreinteVehicule) {
		this.listEmpreinteVehicule = listEmpreinteVehicule;
	}

	public List<AffichageModel> getListAdnVehicule() {
		return listAdnVehicule;
	}

	public void setListAdnVehicule(List<AffichageModel> listAdnVehicule) {
		this.listAdnVehicule = listAdnVehicule;
	}
	
}
