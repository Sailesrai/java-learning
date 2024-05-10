package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Data;
import com.model.Data2;


public class CRUDimpl implements CRUD{

	//static List<Product> plist = new ArrayList<>();
	
	@Override
	public void addStudent(Data2 p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdb","root","");
		String sql = "INSERT INTO Student(Name,Faculty,Age)VALUES('"+p.getName()+"','"+p.getFaculty()+"','"+p.getAge()+"')";
		Statement st =con.createStatement();
		st.execute(sql);
		}catch(Exception e) {
		  e.printStackTrace();
		  
		}
	}

	@Override
	public void deleteStudent(int index) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdb","root","");
			String sql = "Delete from student Where id= "+ index;
			Statement st =con.createStatement();
			st.execute(sql);		
		}catch(Exception e) {
		  e.printStackTrace();
		  System.out.println("Successfully deleted");
		}
	}

	@Override
    public List<Data> getAllDetails() {
        List<Data> productList = new ArrayList<>();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdb","root","");
            String sql = "SELECT * FROM Student";
            statement = con.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id2 = resultSet.getInt("id");
                String name2 = resultSet.getString("Name");
                String Faculty2 = resultSet.getString("Faculty");
                int age2 = resultSet.getInt("age");
                productList.add(new Data(id2,name2,Faculty2,age2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	//	return null;
        return productList;
    }

	
         
}
