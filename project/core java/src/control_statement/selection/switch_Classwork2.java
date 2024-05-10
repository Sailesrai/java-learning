package control_statement.selection;

import java.util.Scanner;

public class switch_Classwork2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int a = sc.nextInt();
	System.out.println("Enter the second number");
	int b = sc.nextInt();

	System.out.println("Enter the operator (+,-,*,/");
	char op = sc.next().charAt(0);
    
	switch(op) {
	
	case '+':
		System.out.println("The result is :"+a+"+"+ b+ "is"+ (a+b));
		break;
		
	case '-':
		System.out.println("The result is :"+a+"-"+ b+ "is"+ (a-b));
		break;
		
	case '*':
		System.out.println("The result is :"+a+"*"+ b+ "is"+ (a*b));
		break;
	
	case '/':
		System.out.println("The result is :"+a+"/"+ b+ "is"+ (a/b));
		break;
		
		default:
			System.out.println("Invalid operator");
		
	
	}
	
} 
}
