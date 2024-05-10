package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<>();
	
	//for class
	/*
	 * List<String> list = new ArrayList<>();
	 */
	
	list.add("Tuntun mausi");
	list.add("Bahubali");
	list.add("Cr7");
	list.add("Messi");
	list.add("Bhim");
	
	//remove the lot
	list.remove(2);
	
	//boolean
	System.out.println(list.contains("Tuntun mausi"));
	
	for(String x : list) {
		System.out.println(x);
	}
}
}
