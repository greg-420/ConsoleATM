package controller;

import java.util.Scanner;

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

	void enterEmail(Scanner sc, String email) {
		System.out.println("Enter email address: ");
		email = sc.nextLine();
	}

	void enterColor(Scanner sc, String color) {
		System.out.println("What is your favourite colour?");
		color = sc.nextLine();
	}

	void enterString(int arg) {
		Scanner sc = new Scanner(System.in);
		String pass1 = null; 
		String pass2 = null; 
		String email = null;
		String color = null;
		if (arg == 1) // pass mode
		{
			if (!enterPass(sc, pass1, pass2))
				return;
			System.out.println("Password creation successful");
		}
		if (arg == 2)
			enterEmail(sc, email);
		if (arg == 3)
			enterColor(sc, color);
		else
			return;
	}

	public void userInput() {
		System.out.println("Creating new user");
		enterString(2);
		enterString(1);
	} //if you pass all the checks, then you are added as a new user. 
}