package filrouge.gedesaft.dao;

import java.sql.ResultSet;

public interface QueryResultObjectInterface {

	public Object queryResult(ResultSet rs, Long id_object) throws Exception;
}
