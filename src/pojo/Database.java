package pojo;

import java.util.ArrayList;
import java.util.List;

public class Database {
	List<User> userDatabase = new ArrayList<User> ();
	
	public void addUser(User refUser){
		userDatabase.add(refUser);
	}
	
	public void getUser(int arg, String s){ //use this method to grab a user with certain particulars
		return;
	}
	
	
}
