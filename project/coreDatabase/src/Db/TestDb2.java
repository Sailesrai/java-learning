package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//Register Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//getConnection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
	
	//Write Sql
//	String sql = "Insert into user(username, password)VALUES('Bijay','BJ36')";
//	String sql1 = "UPDATE users SET password = 'GHane' WHERE id=1";
	
	String sql2 = "CREATE TABLE Student ("
			+ "id INT AUTO_INCREMENT PRIMARY KEY, "
			+ "Name varchar(255) NOT NULL,"
			+ "Address varchar(255) NOT NULL"
			+ ")";
			
			  
	
	String sql3= "INSERT INTO Student(Name,Address)VALUES('Bardan','Jhapa')"; 
	//create statement
	Statement stmt = con.createStatement();
	//execute query
	stmt.execute(sql2);
	stmt.execute(sql3);
	//close connection
	con.close();
	
	System.out.println("success");

	
}
}
