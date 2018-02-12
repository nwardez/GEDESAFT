package co.simplon.springboot.lesexperts.models;

import java.util.ArrayList;

public class VehiculeModel {
	
	private int id_vehicle;
	private String typeVehicule;
	private String marqueVehicule;
	private String modeleVehicule;
	private String immatriculationVehicule;
	private String couleurvehicule;
	private ArrayList<AffaireModel> listAffaireVehicule;
	private ArrayList<EmpreinteModel> listEmpreinteVehicule;
	private ArrayList<AdnModel> listAdnVehicule;
	
	public VehiculeModel () {
		super();
	}

	public int getId_vehicle() {
		return id_vehicle;
	}

	public void setId_vehicle(int id_vehicle) {
		this.id_vehicle = id_vehicle;
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

	public String getCouleurvehicule() {
		return couleurvehicule;
	}

	public void setCouleurvehicule(String couleurvehicule) {
		this.couleurvehicule = couleurvehicule;
	}

	public ArrayList<AffaireModel> getListAffairesVehicule() {
		return listAffaireVehicule;
	}

	public void setListAffairesVehicule(ArrayList<AffaireModel> listAffaireVehicule) {
		this.listAffaireVehicule = listAffaireVehicule;
	}

	public ArrayList<EmpreinteModel> getListEmpreintesVehicule() {
		return listEmpreinteVehicule;
	}

	public void setListEmpreintesVehicule(ArrayList<EmpreinteModel> listEmpreinteVehicule) {
		this.listEmpreinteVehicule = listEmpreinteVehicule;
	}

	public ArrayList<AdnModel> getListAdnVehicule() {
		return listAdnVehicule;
	}

	public void setListAdnVehicule(ArrayList<AdnModel> listAdnVehicule) {
		this.listAdnVehicule = listAdnVehicule;
	}
	
	

	
}
