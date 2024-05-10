package com.info;

public class Info {

	
   private String name;
   private String dept;
   private int id;
   private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "\n Info [name=" + name + ", dept=" + dept + ", id=" + id + ", address=" + address + "]";
}
   
}
