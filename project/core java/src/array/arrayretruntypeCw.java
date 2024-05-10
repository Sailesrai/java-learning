package array;

import java.util.Arrays;

public class arrayretruntypeCw {

	public static void main(String[] args) {
	
		String n[] = getCountryName();
		
		System.out.println(Arrays.toString(n));
		System.out.println(n.length);
	
		
	}

	static String[] getCountryName() {
	
	String countryname[] = {"Nepal","England","USA","Yemen","Canada"};
	
		
	return countryname;
	}
	
}
