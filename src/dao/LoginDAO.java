package dao;

import pojo.User;
import pojo.Database;

public interface LoginDAO {
	User loginDAO(Database db, String email, String password); //login method
}
