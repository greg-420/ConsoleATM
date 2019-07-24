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
	public boolean checkPass(String pass1, String pass2, User refUser) {
		if (!pass1.equals(pass2))
		{
				System.out.println("Password doesn't match!!");
				return false;
		}
		else
		{
			refUser.setString(2, pass1);
			return true;
		}
	}
	@Override
	public boolean checkEmail(String email, Database refDB) {
		return refDB.searchEmail(email);
	}
	
}
