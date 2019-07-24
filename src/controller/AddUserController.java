package controller;

import java.util.Scanner;
import pojo.User;
import service.AddUserService;
import service.AddUserServiceImpl;
import pojo.Database;


public class AddUserController {


	void enterPass(Scanner sc, String pass1, String pass2) {
		System.out.println("Enter Password: ");
		pass1 = sc.nextLine();
		System.out.println("Re-type Password: ");
		pass2 = sc.nextLine();
	}

	void enterEmail(Scanner sc, User refUser) {
		System.out.print("Enter email address: ");
		String email = sc.nextLine();
		refUser.setString(2, email);
	}

	void enterColor(Scanner sc, User refUser) {
		System.out.println("What is your favourite colour?");
		String color = sc.nextLine();
		refUser.setString(3, color);
	}

	void enterString(int arg, Scanner sc, User refUser ) {
		if (arg == 1) {
			String pass1 = null;
			String pass2 = null;
			enterPass(sc, pass1, pass2);
		}
		
		if (arg == 2)
			enterEmail(sc, refUser);
		return;
	}

	public void userInput(Database refDB) {
		System.out.println("Creating new user");
		
		//intialize variables
		Scanner sc = new Scanner(System.in);
		User refUser = new User();
		AddUserService refAddUser = new AddUserServiceImpl();
		
		//ask for email
		enterString(2, sc, refUser); 
		if (refAddUser.checkEmail(refUser.getString(2), refDB))
			refAddUser.addUser(refUser, refDB);
		else System.out.println("email already exists!!");
		
		//ask for password
		enterString(1, sc, refUser);
		//check the password
		
		refDB.printUsers();
		refDB.printNumUsers();
	} //if you pass all the checks, then you are added as a new user. 
}