package Assignment;


public class Q5 {
public static void main(String[] args) {
	double c = circle(54.5);
	System.out.println("The area of circle is "+ c);
	
	float t = triangle(5f,6f);
	System.out.println("The area of triangle is"+t);
	
	rectangle(10,20);
}

static double circle (double r) {
	double area =  Math.PI * r*r * 2;
	return area ;
}
static float triangle(float b, float h) {
	float area = 0.5f*(b*h);
	return area;
}
static void rectangle(int l , int b) {
	int area = l*b;
	System.out.println("The area of rectangle is "+ area);
}
}
