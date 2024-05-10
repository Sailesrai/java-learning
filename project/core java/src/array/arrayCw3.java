package array;

import java.util.Random;
import java.util.Scanner;

public class arrayCw3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	//generate random number
	Random rn = new Random();
	//System.out.println("Enter the number");
	int check = 0;
	int num[] = new int[100];
	
	for(int i=0; i<num.length; i++) {
	    num[i] = rn.nextInt(100);
	//	num[i] = sc.nextInt();
	}
	for(int x : num) {
		check = x;
		if(check%2 != 0) {
			System.out.println("The odd number are"+" "+check);
		}else {
			System.out.println("They are not odd numbers ");
		}
	}
	System.out.println(check);
	sc.close();
}

}
