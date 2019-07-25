package application;

import controller.AddUserController;
import controller.BalanceController;
import controller.ForgetPasswordController;
import controller.LoginController;

import java.util.InputMismatchException;
import java.util.Scanner;
import pojo.User;
import pojo.Database;


public class ATM {

	public static void main(String[] args) {
		// Current: Implementing Register.
		int arg;

		Database refDB = new Database();
		User dummy = new User();
		
		//add a dummy user
		dummy.setString(1, "defaultpass");
		dummy.setString(2, "xyz@gmail.com");
		dummy.setString(3, "defaultcolour");
		refDB.addUser(dummy);
		
		do{ //repeatedly ask user for instructions from the main menu
				Scanner sc = new Scanner(System.in);
				while (true){ //if user inputs an invalid option, catch the exception and ask again.
				System.out.print("\nUser Home Page: \n1. Register \n2. Login \n3. Forget Password \n4. Logout (exit)\n\nEnter Your Choice: ");
				
					try {
							arg = sc.nextInt(); 
							sc.nextLine();
							break;
						}
					catch (InputMismatchException e){
						//do nothing here
					}
				System.out.println ("Error! Please enter an integer between 1 and 4. ");
				sc.nextLine();
				} 
				if (arg == 1) { //case: register.
					AddUserController refAddUserController = new AddUserController();
					refAddUserController.userInput(refDB, sc);
					}
				
				if (arg == 2) { //case: login
					LoginController lc = new LoginController();
					User currentUser = lc.login(refDB, sc);
					if (currentUser == null) //this happens if no such email is found in the database.
					{
						System.out.println("Login Unsuccessful!");
					}
					else {
						System.out.println("Login Successful!!");			
						BalanceController refBC = new BalanceController();
						refBC.balance(sc, refDB, currentUser);
						}
				}
				if (arg == 3) { //forget password option
					ForgetPasswordController refFP = new ForgetPasswordController();
					refFP.forgetPassword(refDB, sc);
				}
				if (!(arg >= 1 && arg <= 4 )) //if user doesn't input the correct number (logic error)
						System.out.println("No such function!");
				}
		while (arg != 4);
		System.out.println("Logout Successfully!!!");
		}
	}

