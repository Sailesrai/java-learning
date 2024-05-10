package Db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
    	  //Register Driver
   	  Class.forName("com.mysql.cj.jdbc.Driver");
   	  //getConnnection(url,un,pw)
   	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
    	  
 
   	/*
   	 * ------------Insert sql----------------------
   	 */
   	// a.Write sql
   	
  //    String sql = "INSERT INTO USER(username,password)VALUES('Bardan','Gpa36')";
      String sql1 = "delete from user where id = 3"; 
   // 	b.Create statement
      
      Statement stm = con.createStatement(); 
   	// c.Exceute query
     // stm.execute(sql);
      stm.execute(sql1);
   	// d.closedb
   	con.close();
   	
   	System.out.println("success");
	}
}
