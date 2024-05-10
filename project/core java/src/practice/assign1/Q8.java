package practice.assign1;

import java.util.Scanner;

public class Q8 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the fahrenheit");
	float f = sc.nextFloat();
	
	//Fahrenheit To Celsius
	float c = ((f-32)/(float)(1.8));
	
	System.out.println(" The celsius is "+ c);
	
	 f= (c*(float)1.8)+32;
	
	System.out.println("The fahrenheit used is  "+f);
	
}
}
