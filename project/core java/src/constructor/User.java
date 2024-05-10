package constructor;

public class User {

	String username;
	String password;
	
	//Default constructor
//	User(){
//		//to set all object in class default values
//		username ="root";
//		password ="52135";
//		
//	}
	//Parameterized constructor
	
	
	//this(); //calling defaukt constructor
	//this(34,3434); //calling parameterized constructor
	User(String username,String password){
//		username = un;
//		password = psw;
		//Constructor gets confused ,ambihuity occurs
	
		/*
		 * 'this' keyword represents current object
		 * using 'this' keyword we can call:
		 *  a) instance variable
		 *  b) instance methods
		 *  c) constructors
		 */
		this.username = username;
		this.password = password;
	}
	
	void printUser() {
		
		System.out.println("Username ="+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		User u = new User("root","8556");
		
		u.printUser();
		
	}
	
}
