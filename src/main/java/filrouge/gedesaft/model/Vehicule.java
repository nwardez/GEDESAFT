package filrouge.gedesaft.model;

import java.util.List;

public class Vehicule {
	
	private Long id_vehicule;
	private String typeVehicule;
	private String marqueVehicule;
	private String modeleVehicule;
	private String immatriculationVehicule;
	private String couleurVehicule;
	private List<RepresentationModel> listProtagonnisteVehicule;
	private List<RepresentationModel> listAffaireVehicule;
	private List<RepresentationModel> listEmpreinteVehicule;
	private List<RepresentationModel> listAdnVehicule;
	
	public Vehicule () {
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

	public List<RepresentationModel> getListProtagonnisteVehicule() {
		return listProtagonnisteVehicule;
	}

	public void setListProtagonnisteVehicule(List<RepresentationModel> listProtagonnisteVehicule) {
		this.listProtagonnisteVehicule = listProtagonnisteVehicule;
	}

	public List<RepresentationModel> getListAffaireVehicule() {
		return listAffaireVehicule;
	}

	public void setListAffaireVehicule(List<RepresentationModel> listAffaireVehicule) {
		this.listAffaireVehicule = listAffaireVehicule;
	}

	public List<RepresentationModel> getListEmpreinteVehicule() {
		return listEmpreinteVehicule;
	}

	public void setListEmpreinteVehicule(List<RepresentationModel> listEmpreinteVehicule) {
		this.listEmpreinteVehicule = listEmpreinteVehicule;
	}

	public List<RepresentationModel> getListAdnVehicule() {
		return listAdnVehicule;
	}

	public void setListAdnVehicule(List<RepresentationModel> listAdnVehicule) {
		this.listAdnVehicule = listAdnVehicule;
	}
	
}
