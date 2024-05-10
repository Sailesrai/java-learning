package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
public static void main(String[] args) {
	List<Student> slist = new ArrayList<>();
	
	Student s1 = new Student();
	slist.add(s1);
	
	s1.setId(5);
	s1.setName("Bardan");
	s1.setFaculty("RNC");
	
	for(Student x : slist) {
		System.out.println(x);
		
	}
	
	
    
	
	
}
}
