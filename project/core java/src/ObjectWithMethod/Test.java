package ObjectWithMethod;

public class Test {
public static void main(String[] args) {

	Customer c = new Customer();
//	
//	c.setId(5);
//	c.setName("Bull");
//	c.setCity("Nepse");
//	c.setPhone("+977 - 3200");
//	c.setAge(24);
//	
	Test t = new Test();
	
	t.printCustomer(c); //since this is instance so we call it by making object of current class 
	Customer d = t.getCustomerData();
	t.printCustomer(d);
	
}

//Object as argument
  // void printCustomer(Customer [] c) {
	   void printCustomer(Customer c) {
	  
	  System.out.println("Id = "+ c.getId());
	  System.out.println("Name = "+c.getName());
	  System.out.println("City ="+c.getCity());
	  System.out.println("Phone = "+c.getPhone());
	  System.out.println("Age = "+c.getAge());
	  
  }
  
//Object as return type
  
 //Customer[] getCustomerData() {
	 Customer getCustomerData() {
	  Customer c = new Customer();
	  
	    c.setId(4);
		c.setName("Bear");
		c.setCity("Nepse");
		c.setPhone("+977 - 1800");
		c.setAge(24);
	  
	  return c;
  }
  
}
