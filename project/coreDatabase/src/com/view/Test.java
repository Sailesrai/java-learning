package com.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.model.Product2;
import com.service.ProductService;
import com.service.ProductServiceimpl;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//Register Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//getConnection
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Productdb", "root", "");
	//write 

	System.out.println("Choose the operation \n "
			+ "1. Add product \n"
			+ "2. Delte product \n"
			+ "3. view product \n"
			+ "4. update product \n");
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
 case 4:
	 update();
	 break;
	 
	 default:

	 
 } 
}

//add product
   static void add() {
	   
	   ProductService ps = new ProductServiceimpl();
	   char flag ='y';
	   Scanner sc = new Scanner(System.in);
	   do {
	   Product2 p = new Product2();
	   
//	   System.out.println("Enter id");
//	   p.setId(sc.nextInt());
	   System.out.println("Enter Company");
	   p.setCompany(sc.next());
	   System.out.println("Enter Name");
	   p.setName(sc.next());
	   System.out.println("Enter Price");
	   p.setPrice(sc.nextInt());
	   
	   ps.addProduct(p);
	   System.out.println("Do you want to add more [y/n]");
	   flag = sc.next().charAt(0);
   }while(flag== 'y');
   sc.close();
   
   System.out.println("Product added successfully");
   }
   //get all product
   
   static void getAll() {
	   
	   ProductService ps = new ProductServiceimpl();
      
       List<Product> plist = ps.getAllProducts();
       // Display all products
       System.out.println("Product List:");
       for (Product pro : plist) {
           System.out.println(pro);
       }
      
	   
   }
   
   //delete product
   static void delete() {
	   Scanner sc =new Scanner(System.in);

	   ProductService ps = new ProductServiceimpl();
	   
	   System.out.println("Enter the id you want to delete.");
	   
      int index = sc.nextInt();
	   ps.deleteProduct(index);
	   
	   sc.close();
   }
   
static void update() {
	   
	   ProductService ps = new ProductServiceimpl();
Scanner sc =new Scanner(System.in);
	 
	   Product2 p = new Product2();
	   
	   System.out.println("Enter id");
	   p.setId(sc.nextInt());
	   System.out.println("Enter Company");
	   p.setCompany(sc.next());
	   System.out.println("Enter Name");
	   p.setName(sc.next());
	   System.out.println("Enter Price");
	   p.setPrice(sc.nextInt());
	   
	   ps.updateProduct(p);
	  


   System.out.println("Product updated successfully");
   }
}

