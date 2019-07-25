package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import pojo.Database;
import pojo.User;
import service.BalanceService;
import service.BalanceServiceImpl;

public class BalanceController {
	public void balance(Scanner sc, Database refDB, User refUser){
		//BalanceService refBS = new BalanceServiceImpl();
		String c = "y";
		int arg;
		System.out.print("Type 1: Check Available Bank Balance\nType 2: Deposit Amount \nType 3: Withdraw Amount\n");
		do {
			while (true){
				System.out.print("\nEnter Your Choice: ");
				try{
					arg = sc.nextInt();
					if (arg >= 1 && arg <=3)
					break;
					else System.out.println("No such choice!");
				}
				catch (InputMismatchException e){
					//do nothing here
				}
				sc.nextLine();
				System.out.println("Error! Please enter an integer between 1 and 3. ");
			}
			if (arg == 1) { //check balance
				System.out.printf("\nAvailable Balance: %.2f\n", refUser.getBalance());
			}
			if (arg == 2) { //deposit amount
				BalanceService refBS = new BalanceServiceImpl();
				refBS.deposit(refUser, refDB, sc);
			}
			if (arg == 3) { //withdraw. 
				BalanceService refBS = new BalanceServiceImpl();
				refBS.withdraw(refUser, refDB, sc);
			} 
			System.out.print("\nWish to Continue? (y/n): ");
			sc.nextLine();
			c = sc.nextLine();
			while (!c.equals("n") && !c.equals("y"))
				{
					System.out.println("Please enter (y/n)");
					c = sc.nextLine();
				}
		} while (c.equals("y"));
		
		System.out.println("\nThanks for Banking with Us !!!");
	}
}
