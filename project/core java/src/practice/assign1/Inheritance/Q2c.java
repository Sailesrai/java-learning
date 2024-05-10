package practice.assign1.Inheritance;

public class Q2c extends Q2p{

 void printc() {
	 System.out.println("This is from child class");
	 System.out.println();
 }
 
 void printu() {
	 super.print();
	 System.out.println("This is method of child by object of child class");
	 System.out.println();
 }
 
}
