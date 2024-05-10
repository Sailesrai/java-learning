package array;

import java.util.Scanner;

public class arrayTest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	//Store and print age of 5 students
    //Steps in array 
	
	
	//create array
System.out.println("Enter age of 5 student");
	int age[] = new int[5];
	
	//write data in array
	for(int i=0; i<age.length; i++) {
	      
		
		age[i]= sc.nextInt();
	}
	//read data from array
	for(int x : age){
		System.out.println(x);
	}
}
}