package oop.Practice;


public class Area {
//Scanner sc = new Scanner(System.in);
	int l;
	int b;
	
	void setDim(int length,int breadth) {
		
	l = length;
	b = breadth;
		
	}
	
	void getArea() {
		
		System.out.println("The area of rectangle is " + l*b);
	}
	
}
