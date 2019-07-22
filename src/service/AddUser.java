package service;

import pojo.User;
import pojo.Database;

interface AddUser{
	boolean checkUser (User refUser);
	void addUser (User refUser, Database refDatabase);
}
