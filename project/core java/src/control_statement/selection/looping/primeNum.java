package control_statement.selection.looping;

import java.util.Scanner;

public class primeNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int count = 0;
	int i = 1;
while (num%i == 0) {
	count++;
	i++;
	}
if(count <= 2) {
	System.out.println("The number is prime");
}else {
	System.out.println("The number is not prime");
}
//System.out.println(i);
	
}
}
