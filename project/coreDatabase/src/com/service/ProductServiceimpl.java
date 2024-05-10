package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.model.Product2;


public class ProductServiceimpl implements ProductService{

	//static List<Product> plist = new ArrayList<>();
	
	@Override
	public void addProduct(Product2 p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","");
		String sql = "INSERT INTO Product(Name,Price,Company)VALUES('"+p.getName()+"','"+p.getPrice()+"','"+p.getCompany()+"')";
		Statement st =con.createStatement();
		st.execute(sql);
		}catch(Exception e) {
		  e.printStackTrace();
		  
		}
	}

	@Override
	public void deleteProduct(int index) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","");
			String sql = "Delete from product Where id= "+ index;
			Statement st =con.createStatement();
			st.execute(sql);		
		}catch(Exception e) {
		  e.printStackTrace();
		  System.out.println("Successfully deleted");
		}
	}

	@Override
    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","");
            String sql = "SELECT * FROM Product";
            statement = con.prepareStatement(sql);
             rs = statement.executeQuery();
            while (rs.next()) {
            	//Product p =new Product();
                int id2 = rs.getInt("id");
                String name2 = rs.getString("name");
                String company2 = rs.getString("company");
                int price2 = rs.getInt("price");
//            	p.setId(rs.getInt("id"));
//            	p.setName(rs.getString("name"));
//            	p.setCompany(rs.getString("company")));
//            	p.setPrice(rs.getInt("price"));
//            	productList.add(p);
               productList.add(new Product(id2,name2,company2,price2));
            	
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	//	return null;
        return productList;
    }

	@Override
	public void updateProduct(Product2 p) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","");
			String sql = "update product set name = '"+p.getName()+"',price ='"+p.getPrice()+"',company ='"+p.getCompany()+"' where id = '"+p.getId()+"' ";
			Statement st =con.createStatement();
			st.execute(sql);
			}catch(Exception e) {
			  e.printStackTrace();
			  
			}
		
	}

	
         
}
