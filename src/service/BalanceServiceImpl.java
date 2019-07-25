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
			System.out.println("Enter Amount: ");
			try {
				amount = sc.nextDouble();
				break;
			}
			catch (InputMismatchException e){
				//do nothing here
			}
			System.out.println("Please enter a number.");
			sc.nextLine();
		}
		
		while (amount < 0) {
			System.out.println("Amount can't be negative!!"); //dont allow withdrawing negative money
			amount = sc.nextDouble();
		}
		if (amount > usr.getBalance()) { //dont allow withdraw if balance will be negative
			System.out.println("Sorry! insufficient balance");
		} else {
			usr.setBalance(usr.getBalance() - amount);
			System.out.println("Transaction successful!");
		}
		
	}

	@Override
	public void deposit(User usr, Database db, Scanner sc) {
		double amount;
		while (true){
			System.out.println("Enter Amount: ");
			try{
				amount = sc.nextDouble();
				break;
			}
			catch (InputMismatchException e){}
			System.out.println("Please enter a number.");
			sc.nextLine();
		}
		while (amount < 0) { //dont allow entering negative numbers
			System.out.println("Amount can't be negative!!");
			System.out.println("Enter Amount: ");
			amount = sc.nextDouble();
		}
		usr.setBalance(usr.getBalance() + amount);
		System.out.printf("%.2f dollar deposited successfully!!!\n", amount);
		
	}

}
