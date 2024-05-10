package Assignment;


public class Q6 {
public static void main(String[] args) {
	double c = circle(54.5);
	System.out.println("The perimeter of circle is "+ c);
	
	int t = triangle(4,5,6);
	System.out.println("The perimeter of triangle is"+t);
	
	rectangle(10,20);
}

static double circle (double r) {
	double p =  Math.PI * r * 2;
	return p ;
}
static int  triangle(int a, int b, int c) {
	int p = a + b+ c;
	return p;
}
static void rectangle(int l , int b) {
	int p = 2*(l+b);
	System.out.println("The perimeter of rectangle is "+ p);
}
}
