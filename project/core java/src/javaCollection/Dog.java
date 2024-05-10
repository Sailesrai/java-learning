package javaCollection;

public class Dog {
  
	private String Name;
	private String Breed;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [Name=" + Name + ", Breed=" + Breed + ", age=" + age + "]";
	}
	
	
}
