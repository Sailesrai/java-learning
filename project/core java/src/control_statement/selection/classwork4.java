package control_statement.selection;

import java.util.Scanner;

public class classwork4 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	if(num<0) {
		System.out.println("The number you entered is "+ num);
	}else {
	System.out.println("The number is positive");
	}
}
}
