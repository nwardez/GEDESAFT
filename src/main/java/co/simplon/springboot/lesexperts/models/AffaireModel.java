package co.simplon.springboot.lesexperts.models;

import java.sql.Date;
import java.util.ArrayList;

public class AffaireModel {
	
	private int id_affaire;
	private String nomAffaire;
	private Date date_crationAffaire;
	private Date date_clotureAffaire;
	private String lieuAffaire;
	private String rapportAffaire;
	private ArrayList<VehiculeModel> listEmpreinteAffaire;
	private ArrayList<ArmeModel> listArmeAffaire;
	private ArrayList<PersonnelModel> listPersonnelAffaire;
	private ArrayList<PersonneModel> listPersonneAffaire;
	
	public AffaireModel() {
		super();
	}


	public int getId_affaire() {
		return id_affaire;
	}


	public void setId_affaire(int id_affaire) {
		this.id_affaire = id_affaire;
	}


	public String getNomAffaire() {
		return nomAffaire;
	}


	public void setNomAffaire(String nomAffaire) {
		this.nomAffaire = nomAffaire;
	}


	public Date getDate_crationAffaire() {
		return date_crationAffaire;
	}


	public void setDate_crationAffaire(Date date_crationAffaire) {
		this.date_crationAffaire = date_crationAffaire;
	}


	public Date getDate_clotureAffaire() {
		return date_clotureAffaire;
	}


	public void setDate_clotureAffaire(Date date_clotureAffaire) {
		this.date_clotureAffaire = date_clotureAffaire;
	}


	public String getLieuAffaire() {
		return lieuAffaire;
	}


	public void setLieuAffaire(String lieuAffaire) {
		this.lieuAffaire = lieuAffaire;
	}


	public String getRapportAffaire() {
		return rapportAffaire;
	}


	public void setRapportAffaire(String rapportAffaire) {
		this.rapportAffaire = rapportAffaire;
	}

	public ArrayList<VehiculeModel> getListEmpreinteAffaire() {
		return listEmpreinteAffaire;
	}


	public void setListEmpreinteAffaire(ArrayList<VehiculeModel> listEmpreinteAffaire) {
		this.listEmpreinteAffaire = listEmpreinteAffaire;
	}


	public ArrayList<ArmeModel> getListArmeAffaire() {
		return listArmeAffaire;
	}


	public void setListArmeAffaire(ArrayList<ArmeModel> listArmeAffaire) {
		this.listArmeAffaire = listArmeAffaire;
	}


	public ArrayList<PersonnelModel> getListPersonnelAffaire() {
		return listPersonnelAffaire;
	}


	public void setListPersonnelAffaire(ArrayList<PersonnelModel> listPersonnelAffaire) {
		this.listPersonnelAffaire = listPersonnelAffaire;
	}


	public ArrayList<PersonneModel> getListPersonneAffaire() {
		return listPersonneAffaire;
	}


	public void setListPersonneAffaire(ArrayList<PersonneModel> listPersonneAffaire) {
		this.listPersonneAffaire = listPersonneAffaire;
	}
	
}
