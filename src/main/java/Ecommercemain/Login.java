package Ecommercemain;

import java.util.Scanner;

public class Login {
	public static void Login() {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------Login Page--------");
		System.out.println("Enter User name:\n");
		String User=sc.next();
		System.out.println("Enter Password:\n");
		String Password=sc.next();
		
		if (User.equals("hsm")) {
			if (Password.equals("123")) {
				System.out.println("Login Successfully");
				return;
			}
		}
		else {
			System.out.println("Invalid User!!");
			
		}
	}

}
