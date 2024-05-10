package control_statement.selection;

import java.util.Scanner;

public class switch_Classwork {
	/*
	 *   Q>  WAP to calculate total salary of following post :
	 *   
	 *      post         basic salary      bonus   total salary 
	 *    ---------     --------------    -------  --------------
	 *    MD                 230000         20%         ?
	 *    CEO                250000         25.79%      ?
	 *    MANAGER            176000          16 %       ?
	 *    HELPER             145900         9%          ?
	 *  ---------------------------------------------------
	 *  
	 *  Q> WAP to calculate +,-,*,/ of two int values using switch.
	 *         
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your post ");
		String post = sc.nextLine();
		
	    switch(post) {
	    
	    case "MD":
	    	int salary = 230000;
	    	int bonus = 20;
	    	int total = ((salary*bonus)/100)+salary;
	    	System.out.println("Your salary is "+ total);
	    	break;
	    	
	    case "CEO":
	    	int s = 250000;
	    	float b = 25.79f;
	    	double t = (float)((s*b)/100)+s;
	    	System.out.printf(" your salary is "+ t);
	    	break;
	    
	    case "MANAGER":
	    int salar = 176000;
    	int bonu = 16;
    	int tota = ((salar*bonu)/100)+salar;
    	System.out.println("Your salary is "+ tota);
	    break;
	    
	    case "HELPER":
	    	int sal = 145900;
	    	int bon = 9;
	    	int tot = ((sal*bon)/100)+sal;
	    	System.out.println("Your salary is "+ tot);
	    	break;
	    	
	    	default:
	    		System.out.println("You don't work here");
	    }
	    
    	
		
	}
}
