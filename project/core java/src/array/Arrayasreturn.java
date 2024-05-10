package array;

import java.util.Arrays;

public class Arrayasreturn {
public static void main(String[] args) {
	
int oddnum[] = getOddnumsFrom1to100();
 
System.out.println(Arrays.toString(oddnum));
	
	
}
static int[] getOddnumsFrom1to100() {

int[] oddnums = new int[50];
int j = 0;

for(int i=1; i<=100; i++) {

	if(i%2 != 0) {
		oddnums[j]=i;
		j++;
	}
}
return oddnums;
}
}
