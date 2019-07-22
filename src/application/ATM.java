package application;

import controller.AddUserController;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// Current: Implementing Register.
		int arg;
		Scanner sc = new Scanner(System.in);
		System.out.print("User Home Page: \n1. Register \n2. Login \n3. Forget Password \n4. Logout\n\nEnter Your Choice: \n");
		arg = Integer.valueOf(sc.nextLine());
		if (arg == 1) {
				AddUserController refAddUserController = new AddUserController();
				refAddUserController.userInput();
				}
		else {
			if (!(arg >= 1 && arg <= 4 ))
				System.out.print("No such function!");
			else System.out.print("Function coming soon! ");
		}
	}

}