package service;

import pojo.Database;
import pojo.User;
import dao.LoginDAO;
import dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {

	@Override
	public User loginService(Database db, String email, String password) {
		LoginDAO logindao = new LoginDAOImpl();
		return logindao.loginDAO(db, email, password);
	}

}
