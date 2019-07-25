package controller;

import java.util.Scanner;

import pojo.Database;
import pojo.User;

public class BalanceController {
	public void balance(Scanner sc, Database refDB, User refUser){
		//BalanceService refBS = new BalanceServiceImpl();
		String c = "y";
		System.out.print("Type 1: Check Available Bank Balance\nType 2: Deposit Amount \nType 3: Withdraw Amount\n");
		do {
			System.out.println("Enter Your Choice: ");
			int arg = sc.nextInt();
			sc.nextLine();
			if (arg == 1) { //check balance
				System.out.printf("Available Balance: %.2f\n", refUser.getBalance());
			}
			if (arg == 2) { //deposit amount
				System.out.println("Enter Amount: ");
				double amount = sc.nextDouble();
				while (amount < 0) {
					System.out.println("Amount can't be negative!!");
					amount = sc.nextDouble();
				}
				refUser.setBalance(refUser.getBalance() + amount);
				System.out.printf("%.2f dollar deposited successfully!!!\n", amount);
			}
			if (arg == 3) {
				System.out.println("Enter Amount: ");
				double amount = sc.nextDouble();
				while (amount < 0) {
					System.out.println("Amount can't be negative!!");
					amount = sc.nextDouble();
				}
				if (amount > refUser.getBalance()) {
					System.out.println("Sorry! insufficient balance");
				} else {
					refUser.setBalance(refUser.getBalance() - amount);
					System.out.println("Transaction successful!");
				}
			} 
			sc.nextLine();
			System.out.print("Wish to Continue? (y/n): "); //doesn't account for other chars!
			c = sc.nextLine();
		} while (c.equals("y"));
	}
}
