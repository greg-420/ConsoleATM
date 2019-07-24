package service;

import pojo.User;
import pojo.Database;

public interface AddUserService{
	boolean checkPass (String pass1, String pass2, User refUser);
	boolean checkEmail (String email, Database refDB);
	void addUser (User refUser, Database refDatabase);
}
