package filrouge.gedesaft.model;

import java.util.List;

public class Vehicule {
	
	private Long id_vehicule;
	private String typeVehicule;
	private String marqueVehicule;
	private String modeleVehicule;
	private String immatriculationVehicule;
	private String couleurVehicule;
	private List<ButtonModel> listProtagonnisteVehicule;
	private List<ButtonModel> listAffaireVehicule;
	private List<ButtonModel> listEmpreinteVehicule;
	private List<ButtonModel> listAdnVehicule;
	
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

	public List<ButtonModel> getListProtagonnisteVehicule() {
		return listProtagonnisteVehicule;
	}

	public void setListProtagonnisteVehicule(List<ButtonModel> listProtagonnisteVehicule) {
		this.listProtagonnisteVehicule = listProtagonnisteVehicule;
	}

	public List<ButtonModel> getListAffaireVehicule() {
		return listAffaireVehicule;
	}

	public void setListAffaireVehicule(List<ButtonModel> listAffaireVehicule) {
		this.listAffaireVehicule = listAffaireVehicule;
	}

	public List<ButtonModel> getListEmpreinteVehicule() {
		return listEmpreinteVehicule;
	}

	public void setListEmpreinteVehicule(List<ButtonModel> listEmpreinteVehicule) {
		this.listEmpreinteVehicule = listEmpreinteVehicule;
	}

	public List<ButtonModel> getListAdnVehicule() {
		return listAdnVehicule;
	}

	public void setListAdnVehicule(List<ButtonModel> listAdnVehicule) {
		this.listAdnVehicule = listAdnVehicule;
	}
	
}
