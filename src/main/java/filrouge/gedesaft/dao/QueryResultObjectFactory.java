package filrouge.gedesaft.dao;

public class QueryResultObjectFactory {
	
	public QueryResultObjectInterface getQueryResultObject (String objectType) {
		
		if (objectType.equals("vehicule")) {
			return new QueryResultVehicule();
		} else {
			return null;
		}
		
//		QueryResultObjectInterface queryResultInstance;
//		
//		switch (objectType) {
//			case "vehicule" : queryResultInstance = new QueryResultVehicule();
//			default: queryResultInstance = null;
//			break;
//		}
//		
//		return queryResultInstance;
	}

}
