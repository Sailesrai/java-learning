package practice.assign1.Inheritance;

public class Square extends Rectangle{
	 
	 public static void main(String[] args) {
		
     Square sq = new Square();
     
     sq.print();
     sq.printr();
	 sq.prints();
	//sq.printc();	 
	}
	  void prints(){
		  
		  System.out.println("Square is a rectangle");
		  System.out.println();
	  }	  
 }
