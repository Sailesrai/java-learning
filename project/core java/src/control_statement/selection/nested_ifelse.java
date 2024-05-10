package control_statement.selection;

public class nested_ifelse {
     public static void main(String[] args) {
		String citizen = "nepali";
		int age = 33;
		boolean haveVoterId = false;
		
		if(citizen.equals("nepali")) {
			
			if(age >= 18) {
				
				if(haveVoterId) {
					System.out.println("You can vote");	
				}else {
					System.out.println("You don't have voter id");
				}
				
				
			}else {
				System.out.println("You are underage");
			}
			
		}else {
			System.out.println("Invalid citizen");
		}
	}
}
