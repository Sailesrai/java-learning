package Abstraction;

public class UserServiceimpl implements UserService,CommonService{
 
	@Override
	public void addUser() {
		
		System.out.println("added success");
		
	}
	
	@Override
	public void deleteUser() {
		
		System.out.println("deleted success");
	}
	
	@Override
	public void prin() {
		System.out.println("Printing...................");

	}
	
	
}
