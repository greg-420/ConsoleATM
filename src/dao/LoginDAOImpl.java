package dao;

import pojo.Database;
import pojo.User;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public User loginDAO(Database db, String email, String password) {
		User tempusr = db.searchUser(email);
		if (tempusr == null)
			return null;
		if (tempusr.getString(1).equals(password))
		{
			System.out.println("Login Successful!!");
			return tempusr;
		}
		return null;
	}

}
