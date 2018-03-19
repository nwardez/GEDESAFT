package filrouge.gedesaft.dao;

import java.util.List;

import filrouge.gedesaft.model.RepresentationModel;

public interface DataDaoInterface {
	
	public List<RepresentationModel> getListRepresentationData (
			Long idRecherche, 
			String idObjectRepresentation, 
			String nameObjectRepresentation, 
			String request
			) throws Exception;
	
	public Object getObjectData (String objectType, Long id, String request) throws Exception;

}
