package ObjectWithMethod;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		Footballer[] a = t3.getFootballerInfo();
		t3.printData(a);
		
	}
	
	//Object method as argument
	
	void printData(Footballer[] f) {
		
		//read array
		for(Footballer x : f) {
			
			System.out.println("Name of player is "+x.getName()+". "+"He is from "+x.getCountry()+
			". "+"He currently plays from "+x.getClub()+". "+"Because of his outstanding game He earns "+
			x.getSalary()+"$. ");
		}
	}
	
	//Object method as return type
	
	Footballer[] getFootballerInfo() {
		
		//create array
		Footballer[] foot = new Footballer[1];
		Scanner sc = new Scanner (System.in);
		//Write array
		
		for(int i=0; i<foot.length; i++) {
			
			Footballer f = new Footballer();
			
			System.out.println("Enter playername");
			f.setName(sc.next());
			
			System.out.println("Enter player's country name");
			f.setCountry(sc.next());
			
			System.out.println("Enter player club name");
			f.setClub(sc.next());
			
			System.out.println("Enter player's salary");
			f.setSalary(sc.nextInt());
		
		    foot[i] = f;
      	   
		}
		 return foot;
		//return;
	}
}
