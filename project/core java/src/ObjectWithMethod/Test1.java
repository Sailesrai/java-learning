package ObjectWithMethod;

import java.util.Scanner;

public class Test1 {
	
	
	
public static void main(String[] args) {
	

//	//create array
//	Customer ct[] = new Customer[1];
//	
//	Scanner sc = new Scanner(System.in);
//	
	

//	//write array
//	for(int i=0; i<ct.length; i++) {
//		Customer c= new Customer();
//		
//		System.out.println("Enter id");
//		c.setId(sc.nextInt());
//		
//		System.out.println("Enter Name");
//		c.setName(sc.next());
//		
//		System.out.println("Enter City name");
//		c.setCity(sc.next());
	
//		
//		System.out.println("ENnter phone ");
//		c.setPhone(sc.next());
//		
//		System.out.println("Enter age");
//		c.setAge(sc.nextInt());
//		
//		ct[i] = c;
//	}
	
	Test1 t = new Test1();
//	t.printCustomer(ct);
	
	Customer[] d = t.getCustomerData();
	t.printCustomer(d);
	
	
	
	
}

//Array of object as argument
void printCustomer (Customer[] a) {
  //read array
	for(Customer c : a ){
		
		System.out.println("id = "+ c.getId());
		System.out.println("Name ="+ c.getName());
		System.out.println("City ="+ c.getCity());
		System.out.println("Phone ="+ c.getPhone());
		System.out.println("age = "+ c.getAge());
	}
	
	
	
}


//Array of argumnet as return type

Customer[] getCustomerData() {
	
Scanner sc = new Scanner(System.in);
	//create array
	Customer ct[] = new Customer[1];
	
	
	
	//write array
	for(int i=0; i<ct.length; i++) {
		Customer c= new Customer();
		
		System.out.println("Enter id");
		c.setId(sc.nextInt());
		
		System.out.println("Enter Name");
		c.setName(sc.next());
		
		System.out.println("Enter City name");
		c.setCity(sc.next());
		
		System.out.println("ENnter phone ");
		c.setPhone(sc.next());
		
		System.out.println("Enter age");
		c.setAge(sc.nextInt());
		
		ct[i] = c;
	}
  return ct;
	
}

}
