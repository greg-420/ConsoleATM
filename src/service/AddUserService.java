package service;

import pojo.User;
import pojo.Database;

public interface AddUserService{
	boolean checkEmail (String email, Database refDB);
	void addUser (User refUser, Database refDatabase);
}
