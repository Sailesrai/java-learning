package Inhertiance;

public class Programmer extends employee  {

	String proglang;
	String project;
	int bonus;
	
	void print() {
		
		super.print();//calls parent print as super notifies the parent class
		System.out.println("Programming language is "+ proglang);
		System.out.println("Project is "+ project);
		System.out.println("Bonus is"+ bonus);
	}
	
}
