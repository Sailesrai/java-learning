package Assignment;
import java.util.Scanner;
public class Q3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter fist number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	int sum = a + b;
	double avg = ((a + b)/2) ;
	
	System.out.println("The sum is "+ sum);
	System.out.println("The average is " + avg);
}
}
