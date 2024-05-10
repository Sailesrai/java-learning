package Aggregation;

public class Test {
public static void main(String[] args) {
	

	Car c =new Car();
	
	c.setColor("Black");
	c.setCompany("BMW");
	c.setModel("Series 5000");
	c.setPrice(500000);
	
	Employee emp = new Employee();
	
	emp.setId(50);
	emp.setCar(c);
     emp.setName("Barfan");
     emp.setSalary(5000000);
     
     System.out.println("Id = "+emp.getId());
     System.out.println("Name = "+emp.getName());
     System.out.println("Salary = "+emp.getSalary();
     System.out.println("-------carinfo-------");
     System.out.println("Model ="+emp.getCar().getModel());
     System.out.println("Company ="+emp.getCar().getCompany());
     System.out.println("Color ="+emp.getCar().getColor());
     System.out.println("Price ="+emp.getCar().getPrice());
     
 }
}