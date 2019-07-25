package application;

import controller.AddUserController;
import controller.ForgetPasswordController;
import controller.LoginController;

import java.util.Scanner;
import pojo.User;
import pojo.Database;


public class ATM {

	public static void main(String[] args) {
		// Current: Implementing Register.
		int arg;

		Database refDB = new Database();
		
		do{ 
				Scanner sc = new Scanner(System.in);
				System.out.print("User Home Page: \n1. Register \n2. Login \n3. Forget Password \n4. Logout\n\nEnter Your Choice: ");
		
				arg = sc.nextInt();
				sc.nextLine();
				if (arg == 1) {
					AddUserController refAddUserController = new AddUserController();
					refAddUserController.userInput(refDB, sc);
					}
				
				if (arg == 2) {
					LoginController lc = new LoginController();
					User currentUser = lc.login(refDB, sc);
					if (currentUser == null)
					{
						System.out.println("Login Unsuccessful!");
					}
					else {
						//enter bank balance mode
						//todo: write this.
					}
				}
				if (arg == 3) {
					ForgetPasswordController refFP = new ForgetPasswordController();
				}
				if (!(arg >= 1 && arg <= 4 ))
						System.out.println("No such function!");
				}
		while (arg != 4);
		System.out.println("Logout Successfully!!!");
		}
	}

