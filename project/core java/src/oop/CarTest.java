package oop;

public class CarTest {
public static void main(String[] args) {
	
	Car c = new Car();
	
	c.model = "Cybertruck";
	c.color ="Blue";
	c.price = 20000;
	c.company = "Tesla";

	c.printCar();
}
}
