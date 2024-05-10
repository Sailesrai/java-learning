package Encapsulation;

public class test {
public static void main(String[] args) {
	product p = new product();
	
	p.setId(83);
	p.setName("TV");
	p.setCompany("Sony");
	p.setPrice(500000);
	
	System.out.println(p);
//	System.out.println("Product id is "+ p.getId());
//	System.out.println("The name of product is "+ p.getName());
//	System.out.println("Product is manufactured by "+ p.getCompany());
//	System.out.println("It cost around "+ p.getPrice());
}
}
