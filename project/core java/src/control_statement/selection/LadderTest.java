package control_statement.selection;

import java.util.Scanner;

public class LadderTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mark");
		float marks = 3.8f;
	
		
		if(marks >= 3.6) {
			System.out.println("A+");
		}else if (marks >= 3.2) {
			System.out.println("A");
		}else if(marks >= 2.8) {
			System.out.println("B+");
		}else if(marks >=2.4){
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
			
		}
		
	}

