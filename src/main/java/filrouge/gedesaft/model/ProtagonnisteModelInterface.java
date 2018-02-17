package filrouge.gedesaft.model;

public interface ProtagonnisteModelInterface {

	public int getId_protagonniste();
	public void setId_protagonniste(int id_personne);
	
	public String getNomProtagonniste();
	public void setNomProtagonniste(String nomPersonne);
	
	public String getPrenomProtagonniste();
	public void setPrenomProtagonniste(String PrenomPersonne);
	
	public String getStatutProtagoniste();
	public void setStatutProtagonniste(String StatutPersonne);
	
	public EmpreinteModel getEmpreinteProtagonniste();
	public void setEmpreinteProtagonniste(EmpreinteModel empreinteProtagonniste);
	
	public AdnModel getAdnProtagonniste();
	public void setAdnProtagonniste(AdnModel adnProtagonniste);
	
}
