package javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
  
	public static void main(String[] args) {
		
	
	//subject - marks
	//Map<String, Integer> map = new HashMap<>();
    //Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
	
	map.put("Math",90);
	map.put("Science",99);
	map.put("Opt.Math",98);
	map.put("English",100);
	map.put("Eph",92);
	map.put("Social Studies",90);
	
	for(String key : map.keySet()) {
		System.out.println(key+"="+map.get(key));
		
	}
	
}
}