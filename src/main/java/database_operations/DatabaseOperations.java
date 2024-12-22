package database_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/ecommerce_management";
		String userName = "root";
		String password = "mohite@123";

		Connection connection = DriverManager.getConnection(url, userName, password); // create connection
		Statement statement = connection.createStatement(); // SQL Script editor
		ResultSet result = statement.executeQuery("select * from users"); // select //pass the query to select and ask
																			// to execute
//		statement.execute(" "); //insert ,update ,delete

		while (result.next()) {
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println(result.getString(5));
			System.out.println("---------------------");
		}

	}
}
