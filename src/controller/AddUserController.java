package controller;

import java.util.Scanner;
import pojo.User;
import service.AddUser;
import service.AddUserImpl;
import pojo.Database;


public class AddUserController {

	boolean matchPass(String pass1, String pass2) {
		if (!pass1.equals(pass2))
			return false;
		else
			return true;
	}

	boolean enterPass(Scanner sc, String pass1, String pass2) {
		System.out.println("Enter Password: ");
		pass1 = sc.nextLine();
		System.out.println("Re-type Password: ");
		pass2 = sc.nextLine();
		if (pass1.equals("")) {
			System.out.println("Invalid Password!");
		}
		if (!matchPass(pass1, pass2)) {
			System.out.println("Password doesn't match!");
			return false;
		}
		return true;
	}

	void enterEmail(Scanner sc, User refUser) {
		System.out.println("Enter email address: ");
		String email = sc.nextLine();
		refUser.setString(2, email);
	}

	void enterColor(Scanner sc, User refUser) {
		System.out.println("What is your favourite colour?");
		String color = sc.nextLine();
		refUser.setString(3, color);
	}

	void enterString(int arg, Scanner sc, User refUser ) {
		
		if (arg == 2)
			enterEmail(sc, refUser);
		return;
	}

	public void userInput() {
		System.out.println("Creating new user");
		
		//intialize variables
		Scanner sc = new Scanner(System.in);
		User refUser = new User();
		Database refDatabase = new Database();
		
		//ask for info
		enterString(2, sc, refUser); 
		AddUser refAddUser = new AddUserImpl();
		refAddUser.addUser(refUser, refDatabase);
		refDatabase.printUsers();
		refDatabase.printNumUsers();
	} //if you pass all the checks, then you are added as a new user. 
}