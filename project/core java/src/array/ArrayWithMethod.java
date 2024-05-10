package array;

public class ArrayWithMethod {
public static void main(String[] args) {
	/* 
	 * Array with method
	 * a) Array as arguments
	 *       void sum(int a[]){
	 *       
	 *       }
	 * 
	 * b) array as return type:
	 * 
	 * int[] getValue(){
	 * 
	 * array = 10,20,20,,20,2,23,1,;
	 * 
	 * return array;
	 * */

	int array[] = {10,20,3,0,40,5,4,0,5,654,65,46,46,546,546,54,654,65,46,5};
       sum(array);
}

static void sum(int values[]) {
	
	int s =0;
	
	for(int x : values) {
		s = s+x;
	}
	System.out.println("The total is "+ s);
}
}
