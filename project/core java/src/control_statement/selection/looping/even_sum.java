package control_statement.selection.looping;

public class even_sum {
public static void main(String[] args) {
	int esum = 0;
	int osum = 0;
	for(int i =1; i<=100; i++) {
	
		if(i%2==0) {
		esum =esum+i;
			
		}else {
			osum = osum+i;
		}
		}
	System.out.println("The sum of even number is "+esum);
	System.out.println("The sum of odd number is "+osum);
}
}
