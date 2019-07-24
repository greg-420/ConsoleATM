package controller;

import java.util.Scanner;
import pojo.User;
import service.AddUserService;
import service.AddUserServiceImpl;
import pojo.Database;


public class AddUserController {


	boolean enterPass(Scanner sc, User refUser) {
		System.out.println("Enter Password: ");
		String pass1 = sc.nextLine();
		System.out.println("Re-type Password: ");
		String pass2 = sc.nextLine();
		if (pass1.equals(pass2))
		{
			refUser.setString(1, pass2);
			return true;
		}
		else {
			System.out.println("Password doesn't match!");
			return false;
		}
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
			enterPass(sc, refUser);
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
		if (refAddUser.checkEmail(refUser.getString(2), refDB)) //todo: swap logic. pass all checks then add user.
			refAddUser.addUser(refUser, refDB);
		else System.out.println("email already exists!!");
		
		//ask for password
		enterString(1, sc, refUser);
		//check the password
		
		refDB.printUsers();
		refDB.printNumUsers();
	} //if you pass all the checks, then you are added as a new user. 
}