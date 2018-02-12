package co.simplon.springboot.lesexperts.models;

public class PersonneModel {
	
	private int id_personne;
	private String nomPersonne;
	private String prenomPersonne;
	private String statutPersonne;
	private EmpreinteModel empreintePersonne;
	private AdnModel adnPersonne;
	private VictimeModel victimeModel;
	private SuspectModel suspectModel;
	private TemoinModel temoinModel;
	
	public PersonneModel() {
		super();
	}

	public int getId_personne() {
		return id_personne;
	}

	public void setId_personne(int id_personne) {
		this.id_personne = id_personne;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	public String getStatutPersonne() {
		return statutPersonne;
	}

	public void setStatutPersonne(String statutPersonne) {
		this.statutPersonne = statutPersonne;
	}

	public EmpreinteModel getEmpreintePersonne() {
		return empreintePersonne;
	}

	public void setEmpreintePersonne(EmpreinteModel empreintePersonne) {
		this.empreintePersonne = empreintePersonne;
	}

	public AdnModel getAdnPersonne() {
		return adnPersonne;
	}

	public void setAdnPersonne(AdnModel adnPersonne) {
		this.adnPersonne = adnPersonne;
	}

	public VictimeModel getVictimeModel() {
		return victimeModel;
	}

	public void setVictimeModel(VictimeModel victimeModel) {
		this.victimeModel = victimeModel;
	}

	public SuspectModel getSuspectModel() {
		return suspectModel;
	}

	public void setSuspectModel(SuspectModel suspectModel) {
		this.suspectModel = suspectModel;
	}

	public TemoinModel getTemoinModel() {
		return temoinModel;
	}

	public void setTemoinModel(TemoinModel temoinModel) {
		this.temoinModel = temoinModel;
	}
	
	

}
