package oop.Practice;

import java.util.Scanner;

public class AreaTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Area a = new Area();
	
	System.out.println("Enter the length of rectangle");
	a.l = sc.nextInt();

	System.out.println("Enter the breadth of rectangle");
	a.b = sc.nextInt();
	
	a.setDim(a.l,a.b);
	a.getArea();

	sc.close();

}
}
