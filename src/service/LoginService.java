package service;

import pojo.Database;
import pojo.User;

public interface LoginService {
	User loginService(Database db, String email, String password);
}
