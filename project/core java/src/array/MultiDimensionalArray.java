package array;

import java.util.Scanner;

public class MultiDimensionalArray {
	
	/* 
	 * 
	 * multiArray
	 * 
	 * USe to manage data in row and column form / matrix otherwise table form
	 * 
	 * syntax 
	 * 
	 *    data_type array name[][] = new data_type[row][col];
	 * */
public static void main(String[] args) {
	//create array
	int mat [][] = new int [2][2];
	
	Scanner sc = new Scanner(System.in);
	
	//write data
	
	for(int i=0; i<2; i++) {
	    
		for(int j=0; j<2; j++) {
			
		System.out.print("Enter value for mat");
		mat[i][j] = sc.nextInt();
		
			
	//	 mat [i][j] = 40;
		}
		
	}
	
	//read data
	
	for(int i=0; i<2; i++) {
		for(int j =0; j<2; j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	//done using dynamic value
}
}
