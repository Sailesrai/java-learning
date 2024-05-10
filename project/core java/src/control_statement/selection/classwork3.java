package control_statement.selection;

import java.util.Scanner;

public class classwork3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter radius ");
	int r = sc.nextInt();
	
	if(r!=0) {
		double area = (Math.PI*r*r);
		System.out.println("the area of circle is"+ area);
	}
	
	
	
}
}
