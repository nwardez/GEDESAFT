package filrouge.gedesaft.dao;

import java.sql.ResultSet;

import filrouge.gedesaft.model.RepresentationModel;


public class QueryResultRepresentation {

	public RepresentationModel queryResult (ResultSet rs, String idRepresentation, String nameRepresentation) throws Exception {
			RepresentationModel representation = new RepresentationModel();
			representation.setId(rs.getLong(idRepresentation));
			representation.setName(rs.getString(nameRepresentation));
			return representation;
	}
}
