package Assignment;

public class Q11 {
public static void main(String[] args) {
	int a = 10;
	int b = 5;
	int temp;
	
	temp = a;
    a = b;
    b = temp;
    
    System.out.println("The swapped value is "+a+","+b);
}
}
