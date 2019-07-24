package service;

import pojo.User;
import pojo.Database;
import dao.AddUserDAO;
import dao.AddUserDAOImpl;

public class AddUserServiceImpl implements AddUserService{

	@Override
	public void addUser(User refUser, Database refDatabase) {
		AddUserDAO refAddUserDAO = new AddUserDAOImpl();
		refAddUserDAO.addUser(refUser, refDatabase);
	}
	@Override
	public boolean checkEmail(String email, Database refDB) {
		return refDB.searchEmail(email);
	}
	
}
