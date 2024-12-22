package Ecommercemain;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import productManagement.ProductManagement;
import userManagement.UserManagement;
	
public class Ecommerce {
	public static void main(String[] args) throws  SQLException, IOException {
		String url="jdbc:mysql://localhost:3306/ecommerce_management";
		String userName="root";
		String password="mohite@123";
		
		Connection connection =DriverManager.getConnection(url,userName,password);  //create connection
		Statement statement =connection.createStatement();  //SQL Script editor
		ResultSet result=statement.executeQuery("select * from users"); 
		Scanner Sc =new Scanner(System.in);
		System.out.println("-------------Welcome to Ecommerce Website -------------\n\n\n");
		Login.Login();
		System.out.println("What do you want to do today:");
		System.out.println("1.User Management ");
		System.out.println("2.Product Management");
		System.out.println("3.Exit");
		
		int input=Sc.nextInt();
		
		switch(input) {
		case 1:
			UserManagement.userManagement();
			break;
		case 2:
			ProductManagement.productManagement();
			break;
		case 3:
			System.out.println("Exit Application");
			return;
		default:
			System.out.println("Invalid Option");
		}
	}
	

}
