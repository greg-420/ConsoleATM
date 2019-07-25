package application;

import controller.AddUserController;
import controller.ForgetPasswordController;

import java.util.Scanner;
import pojo.User;
import pojo.Database;


public class ATM {

	public static void main(String[] args) {
		// Current: Implementing Register.
		int arg;

		Database refDB = new Database();
		
		for (;;){ 
				Scanner sc = new Scanner(System.in);
				User refUser = new User();
				System.out.print("User Home Page: \n1. Register \n2. Login \n3. Forget Password \n4. Logout\n\nEnter Your Choice: \n");
		
				arg = sc.nextInt();
				if (arg == 1) {
					AddUserController refAddUserController = new AddUserController();
					refAddUserController.userInput(refDB);
					}
				if (arg == 3) {
					ForgetPasswordController refFP = new ForgetPasswordController();
				}
				if (arg == 4) {
					System.out.println("Logout Successfully!!!");
					return;
					}
				else {
					if (!(arg >= 1 && arg <= 4 ))
						System.out.println("No such function!");
				}
		}
	}

}