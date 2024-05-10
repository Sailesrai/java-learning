package ObjectWithArray;

import java.util.Scanner;

public class CwTest2 {
	
	public static void main(String[] args) {
		//create array
		
		Cw2 c[]= new Cw2[2];
		
		//write array
		System.out.println("Enter the information");
        
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<c.length; i++) {
			
			Cw2 cw = new Cw2(); 
			System.out.println("Enter id");
			cw.setId(sc.nextInt());
			System.out.println("Enter name");
		    cw.setName(sc.next());
			System.out.println("Enter Company");
			cw.setCompany(sc.next());
			System.out.println("Enter salary");
			cw.setSalary(sc.nextInt());
			System.out.println("Enter department");
			cw.setDepartment(sc.next());
			System.out.println("Enter post");
			cw.setPost(sc.next());
			System.out.println("Enter city");
			cw.setCity(sc.next());
			
			c[i] = cw;
			
		}
		
		//read array
		int tsalary = 0;
		int Isalary =0;
		int hsalary = 0, lsalary = 0;
        for(Cw2 a : c) {
			
        	//for salary
			tsalary = tsalary + a.getSalary();
		
			//for IT student print and their salary
			if(a.getDepartment().equals("IT")) {
			Isalary = Isalary + a.getSalary();
			System.out.println(a.getName());
			}
			
			//for highest and lowest salary 
			hsalary = a.getSalary();
			lsalary = a.getSalary();
			if(hsalary<a.getSalary()) {
		    hsalary = a.getSalary();
			}else {
				System.out.println("The highest salary is "+hsalary);
			}
			
			if(lsalary > a.getSalary()) {
				lsalary = a.getSalary();
			}else {
				System.out.println("The lowest salary is "+lsalary);
			}
			}
        System.out.println(tsalary);
        System.out.println("It salary is "+ Isalary);
	}
}