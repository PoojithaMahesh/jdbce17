package mavenjdbce17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce17","root","root");
	Statement statement=connection.createStatement();
	statement.execute("update user set name='pooji' where id=1");
	connection.close();
	System.out.println("Data Updated successfully");
}
}
