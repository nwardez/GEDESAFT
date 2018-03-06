package filrouge.gedesaft.dao;

import java.util.List;

import filrouge.gedesaft.model.ButtonModel;

public interface DataDaoInterface {
	
	public List<ButtonModel> getListButtonData (
			Long idRecherche, 
			String idObjectButton, 
			String nameObjectButton, 
			String request
			) throws Exception;
	
	public Object getObjectData (String objectType, Long id, String request) throws Exception;

}
