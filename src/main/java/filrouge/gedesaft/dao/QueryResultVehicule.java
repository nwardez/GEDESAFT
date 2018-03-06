package filrouge.gedesaft.dao;

import java.sql.ResultSet;

import filrouge.gedesaft.model.Vehicule;

public class QueryResultVehicule implements QueryResultObjectInterface{
	
	public Vehicule queryResult(ResultSet rs, Long id_object) throws Exception {
		Vehicule vehicule = new Vehicule ();
		vehicule.setId_vehicule(rs.getLong("id_vehicule"));
		vehicule.setTypeVehicule(rs.getString("typeVehicule"));
		vehicule.setMarqueVehicule(rs.getString("marqueVehicule"));
		vehicule.setModeleVehicule(rs.getString("modeleVehicule"));
		vehicule.setCouleurVehicule(rs.getString("couleurVehicule"));
		vehicule.setImmatriculationVehicule(rs.getString("immatriculationVehicule"));		
		return vehicule;
	}

}
