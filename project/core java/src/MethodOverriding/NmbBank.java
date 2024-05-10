package MethodOverriding;

public class NmbBank extends CentralBank{
	
	@Override
	void getBankName() {
		System.out.println("Nmb Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("8%");
	}

}
