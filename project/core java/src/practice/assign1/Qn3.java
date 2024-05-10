package practice.assign1;

import java.util.Scanner;

public class Qn3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	int sum,avg = 0;
	
	sum = a+b;
	avg = sum/2;
	
	System.out.println("The total sum is "+sum );
	System.out.println("The average is "+avg);
}
}
