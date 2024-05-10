package method;

import java.util.Scanner;

public class PrintTable {
public static void main(String[] args) {
//incase of user input 
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	printTable( n);
}
//void no return with argument
static void printTable(int n) {
	for(int i=1; i<=10; i++) {
		System.out.println(n+"*"+i+"="+(n*i));
	}
}
}
