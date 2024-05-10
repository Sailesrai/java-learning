package data_types;

import java.util.Scanner;

public class VariableTest {
     public static void main(String[] args) {
		int l,b,area;
    	 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		l= sc.nextInt();
		
		System.out.println("Enter breadth");
		b=sc.nextInt();
		
		area = l * b;
		
		System.out.println("The area of rectangle is : " +area);
	}
}
