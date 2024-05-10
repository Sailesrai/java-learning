package com.model;

public class Data2 {
    private int id;
    private String name;
    private String Faculty;
    private int age;
//	public Product(int id2, String name2, String company2, int price2) {
//		// TODO Auto-generated constructor stub
//        this.id = id2;
//        this.name = name2;
//        this.company = company2;
//        this.price = price2;

	

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFaculty() {
		return Faculty;
	}



	public void setFaculty(String faculty) {
		Faculty = faculty;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Data2 [id=" + id + ", name=" + name + ", Faculty=" + Faculty + ", age=" + age + "]";
	}

	
    
    
	
}   
