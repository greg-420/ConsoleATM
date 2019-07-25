package controller;

import java.util.Scanner;
import pojo.Database;
import pojo.User;

public class ForgetPasswordController {
	public void forgetPassword(Database refDB, Scanner sc) {
		System.out.println("Forgot Password Menu");
		System.out.print("Enter your ID: ");
		String email = sc.nextLine();
		User usr = refDB.searchUser(email);
		if (usr == null)
		{
			System.out.println("No such user!");
		}
		else 
		{
			System.out.print("What is favourite colour?: ");
			String colour = sc.nextLine();
			if (usr.getString(3).equals(colour))
			{
				System.out.print("Enter new password: ");
				String pass1 = sc.nextLine();
				System.out.print("Retype password: ");
				String pass2 = sc.nextLine();
				int counter = 0;
				while (!pass1.equals(pass2) && counter < 10) //keep prompting for password 
				{
					System.out.println("Password doesn't match");
					System.out.print("Re-type Password: ");
					pass2 = sc.nextLine();
					counter++;
				}
				usr.setString(1, pass2);
			
			System.out.println("What is favourite colour? ");
			String color = sc.nextLine();
			usr.setString(3, color);
			System.out.println(color + " is your security key, incase if you forget your password.");
			System.out.println("Your password has been reset successfully.");
			}
			else 
			{
				System.out.println("Wrong answer!");
				return;
			}
		}
		//call service layer
	}
}
