package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHardCw {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int Total = 0;
	float per = 0f;
	int mat1[] = new int[5];
	
	//System.out.println("Subjects");
	
	String name[] = new String[5];
	
	
	
	System.out.println("Enter the marks of Student");
	//read data
	
	for(int i=0; i<5; i++) {
			
		   mat1 [i]= sc.nextInt();
		   
		
	}
	for(int j=0; j<1; j++) {
		System.out.println("Enter name of student");
		 name[j] = sc.nextLine();
		
	  	
}
	
for(int x : mat1) {
			
			Total = Total + x;
			per = ((float)Total/500)*100;
			//System.out.println( mat1 [i]+ " ");
	}
System.out.println("Subjects");
System.out.println("Name"+" "+"Math"+" "+"Nepali"+" "+"English"+" "+"Computer"+" "+"Science"+" "+"Total"+" "+"Percentage"+" "+"Remarks"+" ");

	System.out.println(name[0]+Arrays.toString(mat1)+Total+per+"%");
for(String y : name) {
//System.out.println(y);
}

    
	
		
		
	}

}
