package Inhertiance;

public class eg2 extends eg1{

	 int cc;
 int gears;
	
	public void attributesCar() {
	
		System.out.println("Speed of car:"+super.speed);
		System.out.println("cc of car"+ cc);
		System.out.println("no. of gears "+ gears);
		super.attributes(); 
		
	}
	
}
