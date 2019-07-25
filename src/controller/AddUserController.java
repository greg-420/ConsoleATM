package controller;

import java.util.Scanner;
import pojo.User;
import service.AddUserService;
import service.AddUserServiceImpl;
import pojo.Database;


public class AddUserController {


	void enterPass(Scanner sc, User refUser) {
		System.out.print("\nEnter Password: ");
		String pass1 = sc.nextLine();
		System.out.print("Re-type Password: ");
		String pass2 = sc.nextLine();
		int counter = 0;
		while (!pass1.equals(pass2) && counter < 10) //keep prompting for password 
		{
			System.out.println("\nPassword doesn't match!!");
			System.out.print("Re-type Password: ");
			pass2 = sc.nextLine();
			counter++;
		}
		refUser.setString(1, pass2);
	}

	void enterEmail(Scanner sc, User refUser) {
		System.out.print("\nEnter email address: ");
		String email = sc.nextLine();
		refUser.setString(2, email);
	}

	void enterColor(Scanner sc, User refUser) {
		System.out.print("\nWhat is favourite colour? ");
		String color = sc.nextLine();
		refUser.setString(3, color);
		System.out.print(color + " is your security key, incase if you forget your password.");
	}

	void enterString(int arg, Scanner sc, User refUser ) {
		if (arg == 1) {
			enterPass(sc, refUser);
		}
		
		if (arg == 2)
			enterEmail(sc, refUser);
		
		if (arg == 3)
			enterColor(sc, refUser);
		return;
	}

	public void userInput(Database refDB, Scanner sc) {
		
		//intialize variables
		User refUser = new User();
		AddUserService refAddUser = new AddUserServiceImpl();
		
		//ask for email
		enterString(2, sc, refUser); 
		while (!refAddUser.checkEmail(refUser.getString(2), refDB))
			{	
				System.out.println("email already exists!!");
				enterString(2, sc, refUser);
			}
		enterString(1, sc, refUser);
		enterString(3, sc, refUser);
		
		refAddUser.addUser(refUser, refDB);
		System.out.println("\n\nRegistration successful!!");
		refDB.printUsers();
		refDB.printNumUsers();
	} //if you pass all the checks, then you are added as a new user. 
}