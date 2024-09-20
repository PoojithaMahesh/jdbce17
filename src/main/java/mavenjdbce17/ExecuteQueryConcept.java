package mavenjdbce17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueryConcept {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
////		1.load and Register the Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
////		2.Establish the Connection
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce17","root","root");
////		3.Create a Statement
//		Statement statement=connection.createStatement();
////		4.Execute a query
//		statement.executeQuery("insert into user values(1,'poojitha','bangalore')");
////		5.Close the connection
//		connection.close();
//		
//		System.out.println("data inserted successfully");
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce17","root","root");
//		Statement statement=connection.createStatement();
//		statement.executeQuery("update user set name='pooji' where id=1");
//		connection.close();
//		System.out.println("Data Updated successfully");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce17","root","root");
		Statement statement=connection.createStatement();
		statement.executeQuery("delete from user where id=1");
		connection.close();
		System.out.println("Data deleted successfully");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
