package dao;

import pojo.Database;
import pojo.User;

public class AddUserDAOImpl implements AddUserDAO{

	@Override
	public void addUser(User refUser, Database refDatabase) {
		// TODO Auto-generated method stub
		refDatabase.addUser(refUser);
	}

}
