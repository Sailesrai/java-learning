package control_statement.selection.looping;

import java.util.Scanner;

public class doWhileCw {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
System.out.println("Enter a number");
int n = sc.nextInt();

do {
	System.out.println(" The number you entered is "+ n);
}while(n==10); 
//System.out.println("Sorry 10 cannot be displayed");

}
}
