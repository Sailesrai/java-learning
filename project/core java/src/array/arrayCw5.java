package array;

import java.util.Scanner;

public class arrayCw5 {
public static void main(String[] args) {
	int marks[] = new int[5];
	Scanner sc = new Scanner(System.in);
	int total =0;
	float percent =0f;
	System.out.println("Enter marks for Math,English,Nepali,Computer,Science");
	
	for(int i=0; i<marks.length; i++) {
		
		marks[i]= sc.nextInt();
	}
	
	for(int x: marks) {
		total = total + x;
		percent = ((float)total/500)*100;
	}
	System.out.println("The total marks is "+ total);
	System.out.println("The percentage obtained is "+" "+percent+"%");
}
}
