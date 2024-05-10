package javaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
		// set of dog and user.
	  
	//Set<String> set = new HashSet<>();
     // Set<String> set = new TreeSet<>();
     Set<String> set = new LinkedHashSet<>();
    	
	set.add("Java");
	set.add("Bhim");
	set.add("Mausi");
	set.add("Kalia");
	set.add("Java");
	set.add("Java");
	set.add("Kalia");
	set.add("Java");
	
	for(String x : set) {
		System.out.println(x);
	}
}
}
