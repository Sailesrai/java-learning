package oop.Practice;

public class Employee {

	String Name;
	int yoj;
	String Address;
	
	void print() {
		System.out.println(Name+" "+yoj+" "+Address);
		
	}
	
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.Name ="Robert";
		emp2.Name ="Sam";
		emp3.Name ="John";
		 
		
		emp1.yoj = 1994;
		emp2.yoj = 2000;
		emp3.yoj = 1999;
		
		emp1.Address = "64C-WallsStreat";
		emp2.Address = "68D*WallsStreat";
		emp3.Address = "26B-WallsStreat";
		
		System.out.println("Name"+" "+"Year of joining"+" "+"Address");
		emp1.print();
		emp2.print();
		emp3.print();
	}
}
