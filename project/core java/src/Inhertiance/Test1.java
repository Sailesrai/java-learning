package Inhertiance;

public class Test1 {
public static void main(String[] args) {
	eg2 e = new eg2();
	
	e.color = "Black";
	e.size = 30;
	e.speed = 450;
	e.gears = 7;
	e.cc = 5000;
	
	e.attributesCar();
}
}

// protected is used for child represent only
//private is used for self represent only
//public is used for all represent only