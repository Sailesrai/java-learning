package control_statement.selection;

import java.util.Scanner;

public class classwork2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal");
		int p = sc.nextInt();
		System.out.println("Enter time ");
		int t= sc.nextInt();
		System.out.println("Enter rate");
		int r = sc.nextInt();
		int I;
		if (p!=0 && t!=0 && r!=0) {
		 I = (p*t*r)/100;
		 System.out.println("The simple interst is "+ I);
		}else {
			System.out.println("There is zero in principal , rate & interest");
		}
	}
	
}
