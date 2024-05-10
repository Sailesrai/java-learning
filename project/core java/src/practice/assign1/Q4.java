package practice.assign1;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal");
	int p = sc.nextInt();
	
	System.out.println("Enter the rate");
	float r = sc.nextFloat();
	
	System.out.println("Enter the time");
	int t = sc.nextInt();
	
	float i=0;
	
	i = (float)(p*t*r)/100;
	
	System.out.println("The simple interest is "+i);
	
}
}
