package service;

import java.util.InputMismatchException;
import java.util.Scanner;

import pojo.Database;
import pojo.User;

public class BalanceServiceImpl implements BalanceService {

	@Override
	public void withdraw(User usr, Database db, Scanner sc) {
		double amount;
		while (true){
			System.out.println("\nEnter Amount: ");
			try {
				amount = sc.nextDouble();
				if (amount >=0)
					break;
				else 
					System.out.println("\nAmount can't be negative!!");
			}
			catch (InputMismatchException e){
				//do nothing here
			}
			System.out.println("Please enter a number.");
			sc.nextLine();
		}
		if (amount > usr.getBalance()) { //dont allow withdraw if balance will be negative
			System.out.print("\nSorry!! insufficient balance");
		} else {
			usr.setBalance(usr.getBalance() - amount);
			System.out.print("\nTransaction successful!");
		}
		
	}

	@Override
	public void deposit(User usr, Database db, Scanner sc) {
		double amount;
		while (true){
			System.out.println("\nEnter Amount: ");
			try{
				amount = sc.nextDouble();
				if (amount >=0)
				break;
				else 
					System.out.println("\nAmount can't be negative!!");
			}
			catch (InputMismatchException e){}
			System.out.println("Please enter a number.");
			sc.nextLine();
		}
		usr.setBalance(usr.getBalance() + amount);
		System.out.printf("\n%.2f dollar deposited successfully!!!\n", amount);
		
	}

}
