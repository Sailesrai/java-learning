package array;

import java.util.Arrays;

public class arraySorting {
public static void main(String[] args) {
	
	int data[]= {1,51,56,16,51,6,5};
	Arrays.sort(data);
	System.out.println(Arrays.toString(data));
	
	System.out.println();
	
	System.out.println("----reverse-----");
	
	for(int i=data.length -1; i>=0; i-- ) {
		// array knows the index place so by reducing the i we can reverse the number
		System.out.print(data[i]+" ");
	}
	
	//fill all data to 90
//	Arrays.fill(data, 80);
//	System.out.println();
//	System.out.println(Arrays.toString(data));
    //fill data from range of 4 to 7
	Arrays.fill(data, 4, 7, 500);
	System.out.println(Arrays.toString(data));
	
	//Arrays.copyOf(data,0);
	System.out.println(Arrays.toString(Arrays.copyOf(data, 2)));
	System.out.println(Arrays.toString(Arrays.copyOfRange(data,1 ,4)));
}
}
