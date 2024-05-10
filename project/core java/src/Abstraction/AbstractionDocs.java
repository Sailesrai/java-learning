package Abstraction;

public class AbstractionDocs {
  /*
   * ---------Abstraction -----------
   *  # process of hiding implementation details in the program is known as abstraction.
   *  # to achieve abstraction :
   *  
   *  a> Abstract Class:
   *  
   * # Class which contains abstract methods (unimplemented methods) and non-abstract methods
   *     is known as abstract class.
   *     
   * # Abstract Method :
   * -> method which does not have implementation/body is known as abstract method.
   * 
   * e.g 
   *    abstract void print();
   *    abstract int getValue(int a,int b)
   *    
   *  #Every abstract class must have atleast one child class and child class
   *   must override abstract methods.
   *  
   *  # we can't create object of abstract class.
   *  # Level of abstraction 0-100%.
   *  
   *  syntax : 
   *  
   *  abstract class class_name{
   *    
   *    //abstract methods 
   *    
   *    //non-abstract methods
   *  
   *  }
   *  
   *     
   *  b> Interface :
   *  
   *  # same as class which contains public absrtact methods only. 
   *  # every interface must have atleast one implementation class and 
   *    impl class must override abstract methods.
   *    
   *  # we can't create object of interface
   *  level of abstraction 100%
   *  
   *    syntax : 
   *    
   *    interface interface_name{
   *    
   *    //public abstract methods
   *    
   *    }
   */


	public abstract class CentralBank {
	  
		abstract void getBankName();
	   abstract  void getInterestRate();
	    
	    void moneyExRate() {
	    	System.out.println("1$ = 132");
	    	System.out.println("Yen 10 = 10");
	    	System.out.println("KDD 1 = 16");
	    }
	}

}
