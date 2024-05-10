package Abstraction;

public class Test {
public static void main(String[] args) {
	

	CentralBank p =  new PrabuBank();
	
	p.getBankName();
	p.getInterestRate();
	
	UserService us =new UserServiceimpl(); //successfully hided the implementation
 
     us.addUser(); //ctrl + to see its process
     us.deleteUser();
    // us.print();
     
//     CommonService cs = new UserServiceimpl();
//     cs.print();
}	

}
