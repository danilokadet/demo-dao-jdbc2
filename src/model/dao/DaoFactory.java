package model.dao;

import db.DB;
import model.dao.iml.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		
		return new SellerDaoJDBC(DB.getConnection());
		
	}

}
