package control_statement.selection.looping;

public class reverse_print {
//67543
	public static void main(String[] args) {
		
	int x = 67543;
	int i=10;
	int s =0;
	int reverse = 0;
	while(x != 0) {
	     s = x % 10;
	    reverse = (reverse*10) + s;
	    x /= 10;
		
	}
	System.out.println("The reversed number is "+ reverse);
}
	}
