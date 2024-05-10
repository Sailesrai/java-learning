package Assignment;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter principal");
		int p = sc.nextInt();
		
		System.out.println("Enter time");
		int t = sc.nextInt();
		
		System.out.println("Enter interest");
		int r = sc.nextInt();
		
	 int I = (p*t*r)/100;
		
		System.out.println("The interest is "+ I);
	}
}
