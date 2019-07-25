package controller;

import java.util.Scanner;
import pojo.Database;
import pojo.User;

public class ForgetPasswordController {
	public void forgetPassword(Database refDB, Scanner sc) {
		System.out.print("\nEnter your ID: ");
		String email = sc.nextLine();
		User usr = refDB.searchUser(email);
		if (usr == null)
		{
			System.out.println("No such user!");
		}
		else 
		{
			System.out.print("\nEnter security key: ");
			String colour = sc.nextLine();
			if (usr.getString(3).equals(colour))
			{
				System.out.print("\nEnter new password: ");
				String pass1 = sc.nextLine();
				System.out.print("\nRetype password: ");
				String pass2 = sc.nextLine();
				int counter = 0;
				while (!pass1.equals(pass2) && counter < 10) //keep prompting for password 
				{
					System.out.println("\nPassword doesn't match");
					System.out.println("Retype Password: ");
					pass2 = sc.nextLine();
					counter++;
				}
				usr.setString(1, pass2);
			
			System.out.println("What is favourite colour? ");
			String color = sc.nextLine();
			usr.setString(3, color);
			System.out.println(color + " is your security key, incase if you forget your password.");
			System.out.println("\nYour password has been reset successfully.");
			}
			else 
			{
				System.out.println("\nWrong answer!");
				return;
			}
		}
		//call service layer
	}
}
