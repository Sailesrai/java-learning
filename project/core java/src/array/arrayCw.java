package array;

import java.util.Scanner;

public class arrayCw {
public static void main(String[] args) {
	int total = 0;
	int avg = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter price of 10 books");
	int books[] = new int[10];
	
	for(int i=0; i<books.length; i++) {
		
		
		books[i] = sc.nextInt();
	}
	for(int x : books) {
		
		 total = total + x;
		 
		 avg = (total /books.length);
		
	}
	System.out.println("The total price of books is " +total);
	System.out.println("The average price of book is " +avg);
	
} 
}
