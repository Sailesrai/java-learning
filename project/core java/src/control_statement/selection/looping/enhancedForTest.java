package control_statement.selection.looping;

public class enhancedForTest {
public static void main(String[] args) {
	int values[]= {54,65,99,25,785,454,545,565,847};
	int s = 0;
	for(int x : values) {
		System.out.println(x);
s = s +x;		
	}
	System.out.println("The total is "+ s);
	}
}

