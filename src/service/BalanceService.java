package service;

import java.util.Scanner;

import pojo.Database;
import pojo.User;

public interface BalanceService {
	void withdraw(User usr, Database db, Scanner sc); 
	void deposit(User usr, Database db, Scanner sc);
}
