package Overriding_Overloading_example;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	
	//create array
	Student std[] = new Student[1];
	Scanner sc = new Scanner(System.in);
	//write array for first method
	
    
	for(int i =1; i< std.length; i++) {
		
		Student s = new Student();
		
		System.out.println("Enter Name");
		s.setName(sc.next());
		System.out.println("Enter age");
		s.setAge(sc.nextInt());
		System.out.println("Enter address");
		s.setAddress(sc.next());
		
		std[i] = s;
	}


}

	  
  
}
