package MethodOverriding;

public class NICAsiaBank extends CentralBank{

	@Override
	void getBankName() {
		System.out.println("Nic Asia Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("50%");
	}
	
}
