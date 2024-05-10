package com.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.model.Data;
import com.model.Data2;
import com.service.CRUD;
import com.service.CRUDimpl;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//Register Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//getConnection
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdb", "root", "");
	//write 

	System.out.println("Choose the operation \n "
			+ "1. Add Student \n"
			+ "2. Delte Student \n"
			+ "3. view Details \n");
  Scanner sc =new Scanner(System.in);
 int num = sc.nextInt();
 switch(num) {
 case 1:
	 add();
	 break;
 case 2:
	 delete();
	 break;
	 
 case 3:
	 getAll();
	 break;
	 
	 
 } 
}

//add product
   static void add() {
	   
	   CRUD ps = new CRUDimpl();
	   char flag ='y';
	   Scanner sc = new Scanner(System.in);
	   do {
	   Data2 p = new Data2();
	   
//	   System.out.println("Enter id");
//	   p.setId(sc.nextInt());
	   System.out.println("Enter Faculty");
	   p.setFaculty(sc.next());
	   System.out.println("Enter Name");
	   p.setName(sc.next());
	   System.out.println("Enter Age");
	   p.setAge(sc.nextInt());
	   
	   ps.addStudent(p);
	   System.out.println("Do you want to add more [y/n]");
	   flag = sc.next().charAt(0);
   }while(flag== 'y');
   sc.close();
   
   System.out.println("Product added successfully");
   }
   //get all product
   
   static void getAll() {
	   
	   CRUD ps = new CRUDimpl();
      
       List<Data> plist = ps.getAllDetails();
       // Display all products
       System.out.println("Product List:");
       for (Data pro : plist) {
           System.out.println(pro);
       }
      
	   
   }
   
   //delete product
   static void delete() {
	   Scanner sc =new Scanner(System.in);

	   CRUD ps = new CRUDimpl();
	   
	   System.out.println("Enter the id you want to delete.");
	   
      int index = sc.nextInt();
	   ps.deleteStudent(index);
	   
	   sc.close();
   }
   

}
