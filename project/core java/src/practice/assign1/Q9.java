package practice.assign1;

import java.util.Scanner;

public class Q9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the pound");
	int pound = sc.nextInt();
	float kg;
	
	kg = (float)0.454*pound;
	System.out.println("It is "+kg+"kg");
	
}
}
