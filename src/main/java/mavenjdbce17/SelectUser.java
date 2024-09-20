package mavenjdbce17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUser {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce17","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from User where id =2");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
		connection.close();
		System.out.println("Data selected successfully");
		
	}
}
