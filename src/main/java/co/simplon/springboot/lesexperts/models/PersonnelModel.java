package co.simplon.springboot.lesexperts.models;

import java.util.ArrayList;

public class PersonnelModel {
	
	private int id_personnel;
	private String nomPersonnel;
	private String prenomPersonnel;
	private String gradePersonnel;
	private String identifiantPersonnel;
	private String passwordPersonnel;
	private ArrayList<AffaireModel> listAffairePersonnel;
	
	public PersonnelModel () {
		super();
	}

	public int getId_personnel() {
		return id_personnel;
	}

	public void setId_personnel(int id_personnel) {
		this.id_personnel = id_personnel;
	}

	public String getNomPersonnel() {
		return nomPersonnel;
	}

	public void setNomPersonnel(String nomPersonnel) {
		this.nomPersonnel = nomPersonnel;
	}

	public String getPrenomPersonnel() {
		return prenomPersonnel;
	}

	public void setPrenomPersonnel(String prenomPersonnel) {
		this.prenomPersonnel = prenomPersonnel;
	}

	public String getGradePersonnel() {
		return gradePersonnel;
	}

	public void setGradePersonnel(String gradePersonnel) {
		this.gradePersonnel = gradePersonnel;
	}

	public String getIdentifiantPersonnel() {
		return identifiantPersonnel;
	}

	public void setIdentifiantPersonnel(String identifiantPersonnel) {
		this.identifiantPersonnel = identifiantPersonnel;
	}

	public String getPasswordPersonnel() {
		return passwordPersonnel;
	}

	public void setPasswordPersonnel(String passwordPersonnel) {
		this.passwordPersonnel = passwordPersonnel;
	}

	public ArrayList<AffaireModel> getListAffairePersonnel() {
		return listAffairePersonnel;
	}

	public void setListAffairePersonnel(ArrayList<AffaireModel> listAffairePersonnel) {
		this.listAffairePersonnel = listAffairePersonnel;
	}

	
}
