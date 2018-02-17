package filrouge.gedesaft.model;

public class ProtagonnisteModelImpl implements ProtagonnisteModelInterface {
	
	private int id_protagonniste;
	private String nomProtagonniste;
	private String prenomProtagonniste;
	private String statutProtagonniste;
	private EmpreinteModel empreinteProtagonniste;
	private AdnModel adnProtagonniste;
	
	public ProtagonnisteModelImpl() {
		super();
	}

	@Override
	public int getId_protagonniste() {
		return id_protagonniste;
	}

	@Override
	public void setId_protagonniste(int id_protagonniste) {
		this.id_protagonniste = id_protagonniste;
	}

	@Override
	public String getNomProtagonniste() {
		return nomProtagonniste;
	}

	@Override
	public void setNomProtagonniste(String nomProtagonniste) {
		this.nomProtagonniste = nomProtagonniste;
	}

	@Override
	public String getPrenomProtagonniste() {
		return prenomProtagonniste;
	}

	@Override
	public void setPrenomProtagonniste(String prenomProtagonniste) {
		this.prenomProtagonniste = prenomProtagonniste;
	}

	@Override
	public String getStatutProtagoniste() {
		return statutProtagonniste;
	}

	@Override
	public void setStatutProtagonniste(String statutProtagonniste) {	
	}

	@Override
	public EmpreinteModel getEmpreinteProtagonniste() {
		return empreinteProtagonniste;
	}

	@Override
	public void setEmpreinteProtagonniste(EmpreinteModel empreinteProtagonniste) {
		this.empreinteProtagonniste = empreinteProtagonniste;
	}

	@Override
	public AdnModel getAdnProtagonniste() {
		return adnProtagonniste;
	}

	@Override
	public void setAdnProtagonniste(AdnModel adnProtagonniste) {
		this.adnProtagonniste = adnProtagonniste;
	}
}
