package ObjectWithArray;

import java.util.Scanner;

public class CowTest {
public static void main(String[] args) {
	int total =0;
	//store and print of 5 cows.
	
	//create array
	Cow cows[] = new Cow[5];
	
	//write data in array
	Scanner sc = new Scanner(System.in);
	
	//in a loop
	System.out.println("Enter for 5 cows");
	for(int i=0; i<cows.length;i++) {
	Cow c  = new Cow();
//	c.setId(454);
//	c.setName("Bardan");
//	c.setColor("White & black");
//	c.setPrice(50000);
//	cows[0] = c;
	System.out.println("Enter id");
	c.setId(sc.nextInt());
	
	System.out.println("Enter name");
	c.setName(sc.nextLine());
	
	System.out.println("Enter price");
	c.setPrice(sc.nextInt());
	
	System.out.println("Enter color:");
	c.setColor(sc.nextLine());
	

	
	
		cows[i] = c;
	}
	
	//read data from array
	for (Cow cw : cows) {
		
		total = total + cw.getPrice();
		
		System.out.println(cw);
	}
	System.out.println("The total price of cow is "+ total);
	
}
}
