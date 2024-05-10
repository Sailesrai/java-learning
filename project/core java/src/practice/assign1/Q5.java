package practice.assign1;

import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length");
    int l =sc.nextInt();
    System.out.println("Enter the breadth");
    int b = sc.nextInt();
    System.out.println("Enter the base");
    int b1 = sc.nextInt();
    System.out.println("Enter the height");
    int h = sc.nextInt();
    System.out.println("Enter the radius"); 
	float r = sc.nextInt();

int ar = 0;
float ac =0;
float at = 0;
	
ac = (float)Math.PI*(r*r);
ar = l*b;
at = (float)0.5*b1*h;

System.out.println("The area of rectangle is "+ ar);
System.out.println("The area of circle is "+ ac);
System.out.println("The area of triangle is "+at);
}
}
