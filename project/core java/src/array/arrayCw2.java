package array;

import java.util.Scanner;

public class arrayCw2 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the name of cities");
	String cities[]= new String[6];
	
	for(int i=0; i<cities.length; i++) {
		System.out.println();
		cities[i] = sc.nextLine();
	}
	
	for(String x : cities) {
		System.out.println("The name of the cities are :"+ x);
	}
}
}
