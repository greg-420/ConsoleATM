package dao;

import pojo.Database;
import pojo.User;

public class AddUserDAOImpl implements AddUserDAO{

	@Override
	public void addUser(User refUser, Database refDatabase) {
		// push a user onto the database.
		refDatabase.addUser(refUser);
	}
}
