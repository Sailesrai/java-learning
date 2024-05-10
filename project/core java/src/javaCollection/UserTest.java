package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

	public static void main(String[] args) {
		
		List<User> user = new ArrayList<>();
		
		User u = new User();
		user.add(u);
		
		//Set Class
		u.setId(5);
		u.setName("Bardan");
		u.setHobby("Horny");
		u.setPhonenum("98130645654");
	
		for(User x : user) {
			
			System.out.println(x);
			
		}
	}
	
}
