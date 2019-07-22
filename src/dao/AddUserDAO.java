package dao;

import pojo.Database;
import pojo.User;

public interface AddUserDAO {
	void addUser (User refUser, Database refDatabase);
}
