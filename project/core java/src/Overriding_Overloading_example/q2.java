package Overriding_Overloading_example;

public class q2 {

	static void print(int n, char c) {
	 
	System.out.println(n+","+c);
	}
	
	static void print(char c, int n) {
		System.out.println(c+","+n);
		
	}
	public static void main(String[] args) {
		q2 q = new q2();
		q.print(3,'a');
		q.print('a',3);
	}
}
