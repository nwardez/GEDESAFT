package filrouge.gedesaft.dao;

public class QueryResultObjectFactory {
	
	public QueryResultObjectInterface getQueryResultObject (String objectType) {
		
		switch (objectType) {
			case "vehicule" : return new QueryResultVehicule();
			default: return null;
		}
		
	}

}
