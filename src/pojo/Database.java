package pojo;

import java.util.ArrayList;
import java.util.List;

public class Database {
	List<User> userDatabase = new ArrayList<User> ();
	
	public boolean validUser(User refUser){
		return false; //dummy method
	}
	
	public void addUser(User refUser){
		//check that this is a valid User Object
		if (validUser(refUser))
		userDatabase.add(refUser);
		else 
		System.out.println("Invalid User!");
	}
}
