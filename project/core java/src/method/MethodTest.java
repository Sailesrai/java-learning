package method;

//import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		
		int sm = smallest(4,6);
		System.out.println("The smallest is " +sm);
// int sum = getSumof1to100();
// System.out.println("The sum of 100 nums is "+sum);
	//	printTable(1);
	//sum();
}
	// main only accepts static so we make it call into static
	// no return type with no arguments
//	static void sum() {
//		int a = 3434;
//		int b =5656;
//		int c= a+b;
//		System.out.println("The sum is "+ c);
//	}
//	// no return type with argument	
//	static void printTable(int n) {
//		for(int i=1; i<=10; i++) {
//			System.out.println(n+"*"+i+"="+(n*i));
//		}
//	}
	
	//return type with no argument
//	static int getSumof1to100() {
//		
//		int s =0;
//		for(int i=1; i<=100; i++) {
//			s = s + i;
//		}
//		return s;
//	}
	//return type with arguments
	static int smallest(int x, int y) {
		if(x < y) {
			return x;
		}else {
			return y;
		}
		
	}
}



