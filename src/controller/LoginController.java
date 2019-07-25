package controller;

import java.util.Scanner;

import pojo.Database;
import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {
	public User login(Database refDB, Scanner sc){
		System.out.print("Enter User ID: ");
		String id = sc.nextLine();
		System.out.print("Enter Password: ");
		String password = sc.nextLine();
		LoginService loginsrv = new LoginServiceImpl(); 
		return loginsrv.loginService(refDB, id, password);
		
		// call methods to access db
	}
}
