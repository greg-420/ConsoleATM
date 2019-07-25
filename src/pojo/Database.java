package pojo;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<User> userDatabase = new ArrayList<User> ();
	
	public void addUser(User refUser){
		userDatabase.add(refUser);
	}
	
	public void getUser(int arg, String s){ //use this method to grab a user with certain particulars
		return;
	}
	
	public void printUsers(){ //print all user emails in the database
		for (User element: userDatabase){
			System.out.println(element.getString(2));
		System.out.println("");
		}
	}
	
	public void printNumUsers(){ //print number of all users
		int i = 0;
		for (User element: userDatabase){
			i++;
		}
		System.out.println("There are " + i + " total users.");
	}
	
	public boolean searchEmail(String email){ //return false if there is a match, true if email is new.
		for (User element: userDatabase){
			if (element.getString(2).equals(email))
				return false;
		}
		return true;
	}
	
	public User searchUser(String email){
		for (User element: userDatabase)
		{
			if (element.getString(2).equals(email));
			return element;
		}
		return null;
	}
}
