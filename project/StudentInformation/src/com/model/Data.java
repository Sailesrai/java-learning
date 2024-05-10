package com.model;

public class Data {
    private int id;
    private String name;
    private String Faculty;
    private int age;
	public Data(int id2, String name2, String Faculty2, int age2) {
		// TODO Auto-generated constructor stub
        this.id = id2;
        this.name = name2;
        this.Faculty = Faculty2;
        this.age = age2;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", Faculty=" + Faculty + ", age=" + age + "]";
	}

    
	
}   
