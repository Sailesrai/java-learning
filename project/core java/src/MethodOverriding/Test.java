package MethodOverriding;

public class Test {
public static void main(String[] args) {
	
	//Static or early binding of object -- know whose we are getting first
	
	//NabilBank nb = new NabilBank(); or
	


	//up -casting 
    CentralBank pb = new PrabhuBank();
    CentralBank nmb = new NmbBank();
    CentralBank nic = new NICAsiaBank();
    CentralBank nb = new NabilBank();
    
    printBankInfo(nmb);
    printBankInfo(pb);
    printBankInfo(nic);
    printBankInfo(nb);
} 
  
     //dynamic or late binding of object or runtime polymorphism

    static void printBankInfo(CentralBank b) {
    	b.getBankName();
    	b.getInterestRate();
    	
    }
}
