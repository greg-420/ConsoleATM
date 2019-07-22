package application;

import controller.AddUserController;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("User Home Page: \n 1. Register \n 2. Login \n 3. Forget Password \n 4. Logout\n");
		
		
		AddUserController refAddUserController = new AddUserController();
		refAddUserController.userInput();
	}

}
