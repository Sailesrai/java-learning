package control_statement.selection;
import java.util.Scanner;
public class Iftest {

	/*
	Syntax:
	if(condition){
	Statement;
	}
*/
	public static void main(String[] args) {
	//	int salary =10000;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter your salary");
		int salary = sc.nextInt();
		
		if(salary<20000) {
			salary = salary+8000;
	
		}
		System.out.println("Total salary ="+salary);
	}
}
