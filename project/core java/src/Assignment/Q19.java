package Assignment;

import java.util.Scanner;

public class Q19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first side of triangle");
	int a = sc.nextInt();
	System.out.println("Enter second side of triangle");
	int b = sc.nextInt();
	System.out.println("Enter third side of triangle");
	int c = sc.nextInt();
	
	if(a==b &&b==c &&a==c ) {
		System.out.println("It is equilateral triangle");
	}else if (a==b || a==c || b==c) {
		System.out.println("It is isoceles triangle");
	}else {
		System.out.println("It is scalene triangle");
	}
}
}
