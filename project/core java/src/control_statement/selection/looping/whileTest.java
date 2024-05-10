package control_statement.selection.looping;

public class whileTest {
public static void main(String[] args) {
	int x = 5;
	int fact = 1;
	while(x>1 ) {
		fact = fact * x;
		x--;
	}
	System.out.println("The factorial of is" + fact);
}
}





