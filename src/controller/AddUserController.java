package controller;

import java.util.Scanner;

public class AddUserController{
	
	boolean matchPass(String pass1, String pass2){
		
		if (!pass1.equals(pass2))
		return false;
		else return true;
	}
	
	boolean enterPass(Scanner sc){
		String password1, password2;
		System.out.println("Please enter your password: ");
		password1 = sc.nextLine();
		System.out.println("Please re-enter your password: ");
		password2 = sc.nextLine();
		if (password1.equals("")){
			System.out.println("Invalid Password");
		}
		if (!matchPass(password1, password2)){
			System.out.println("Passwords do not match!");
			return false;
		}
		return true;
	}
	
	void enterEmail(Scanner sc){
		String email;
		System.out.println("Please enter your email: ");
		email = sc.nextLine();
	}
	
	void enterColor(Scanner sc){
		String color;
		System.out.println("What is your favourite colour?");
		color = sc.nextLine();
	}
	
	void enterString(int arg){
		Scanner sc = new Scanner(System.in);
		if (arg == 1) //pass mode
			{
				if (!enterPass(sc)) return;
				System.out.println("Password creation successful");
			}
		if (arg == 2)
			enterEmail(sc);
		if (arg == 3)
			enterColor(sc);
		else return;
	}

	
	public void userInput(){
		System.out.println("Creating new user");
		enterString(1);
		}
	}