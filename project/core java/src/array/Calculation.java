package array;

public class Calculation {

	public static void main(String[] args) {
		
		//addition of matrix using static value
		
		//write data
		int mat1[][] = {{11,10},{13,15}};
		int mat2[][] = {{10,11},{10,11}};
		
		int mat3[][] = new int[2][2];
		
		//add and read data
		
		for(int i=0; i<2; i++) {

			for(int j=0; j<2; j++) {
				
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				
				System.out.print(mat3[i][j]+" ");
				
			}
			
			System.out.println();
		}
		
	}
}
