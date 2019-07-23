package service;

import pojo.User;
import pojo.Database;
import dao.AddUserDAO;
import dao.AddUserDAOImpl;

public class AddUserImpl implements AddUser{

	@Override
	public void addUser(User refUser, Database refDatabase) {
		AddUserDAO refAddUserDAO = new AddUserDAOImpl();
		refAddUserDAO.addUser(refUser, refDatabase);
	}
	
}
