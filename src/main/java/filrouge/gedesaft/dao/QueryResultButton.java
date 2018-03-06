package filrouge.gedesaft.dao;

import java.sql.ResultSet;

import filrouge.gedesaft.model.ButtonModel;


public class QueryResultButton {

	public ButtonModel queryResult (ResultSet rs, String idButton, String nameButton) throws Exception {
			ButtonModel button = new ButtonModel();
			button.setId(rs.getLong(idButton));
			button.setName(rs.getString(nameButton));
			return button;
	}
}
