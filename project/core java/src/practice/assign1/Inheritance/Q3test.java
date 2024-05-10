package practice.assign1.Inheritance;

public class Q3test {
public static void main(String[] args) {
	

	Employee e = new Employee();
	Manager m = new Manager();
	Member me = new Member();
	
	// for employee
	e.Name ="Ram";
	e.age = 22;
	e.phonenum = 984512545;
	e.address = "Koteshwor";
	e.salary = 45000;
	e.specialization = "Dentist";
	e.department = "Doctor";
	
	//for manager
	m.Name = "Sailesh";
	m.age = 24;
	m.phonenum = 984512151;
	m.address = "Bhaktapur";
	m.salary = 60000;
	m.specialization = "Heart";
	m.department = "Doctor";

	e.test();
	m.print();
	
}
}