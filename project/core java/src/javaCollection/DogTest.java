package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class DogTest {
public static void main(String[] args) {
	

	List<Dog> s = new ArrayList<>();
	
	Dog d = new Dog();
    s.add(d);
	
	//set properties
    d.setName("Maxi");
	d.setAge(3);
	d.setBreed("Golden Retriever");
	
	for(Dog x : s) {
		System.out.println(x);
	}
}
}
