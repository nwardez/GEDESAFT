package co.simplon.springboot.lesexperts.models;

import java.util.ArrayList;

public class ArmeModel {
	
	private int id_arme;
	private String modelArme;
	private String typeArme;
	private ArrayList<AdnModel> listAdnArme;
	private ArrayList<EmpreinteModel> listEmpreinteModel;
	private ArrayList<AffaireModel> listAffaireArme;
	
	public ArmeModel() {
		super();
	}

	public int getId_arme() {
		return id_arme;
	}

	public void setId_arme(int id_arme) {
		this.id_arme = id_arme;
	}

	public String getModelArme() {
		return modelArme;
	}

	public void setModelArme(String modelArme) {
		this.modelArme = modelArme;
	}

	public String getTypeArme() {
		return typeArme;
	}

	public void setTypeArme(String typeArme) {
		this.typeArme = typeArme;
	}

	public ArrayList<AdnModel> getListAdnArme() {
		return listAdnArme;
	}

	public void setListAdnArme(ArrayList<AdnModel> listAdnArme) {
		this.listAdnArme = listAdnArme;
	}

	public ArrayList<EmpreinteModel> getListEmpreinteModel() {
		return listEmpreinteModel;
	}

	public void setListEmpreinteModel(ArrayList<EmpreinteModel> listEmpreinteModel) {
		this.listEmpreinteModel = listEmpreinteModel;
	}

	public ArrayList<AffaireModel> getListAffaireArme() {
		return listAffaireArme;
	}

	public void setListAffaireArme(ArrayList<AffaireModel> listAffaireArme) {
		this.listAffaireArme = listAffaireArme;
	}
	

}
