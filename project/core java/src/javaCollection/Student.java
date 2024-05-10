package javaCollection;

public class Student {
   int id;
  private String name;
  private String faculty;
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
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", faculty=" + faculty + "]";
}
   
}
