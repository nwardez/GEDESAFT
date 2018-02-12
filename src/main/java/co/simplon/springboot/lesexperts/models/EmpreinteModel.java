package co.simplon.springboot.lesexperts.models;

import java.util.ArrayList;

public class EmpreinteModel {
	
	private int id_empreinte;
	private String empreinte;
	private PersonneModel personneEmpreinte;
	private ArrayList<ArmeModel> listArmeEmpreinte;
	private ArrayList<VehiculeModel> listVehiculeEmrpreinte;
	
	public EmpreinteModel() {
		super();
	}

	public int getId_empreinte() {
		return id_empreinte;
	}

	public void setId_empreinte(int id_empreinte) {
		this.id_empreinte = id_empreinte;
	}

	public String getEmpreinte() {
		return empreinte;
	}

	public void setEmpreinte(String empreinte) {
		this.empreinte = empreinte;
	}

	public PersonneModel getPersonneEmpreinte() {
		return personneEmpreinte;
	}

	public void setPersonneEmpreinte(PersonneModel personneEmpreinte) {
		this.personneEmpreinte = personneEmpreinte;
	}

	public ArrayList<ArmeModel> getListArmeEmpreinte() {
		return listArmeEmpreinte;
	}

	public void setListArmeEmpreinte(ArrayList<ArmeModel> listArmeEmpreinte) {
		this.listArmeEmpreinte = listArmeEmpreinte;
	}

	public ArrayList<VehiculeModel> getListVehiculeEmrpreinte() {
		return listVehiculeEmrpreinte;
	}

	public void setListVehiculeEmrpreinte(ArrayList<VehiculeModel> listVehiculeEmrpreinte) {
		this.listVehiculeEmrpreinte = listVehiculeEmrpreinte;
	}

}
