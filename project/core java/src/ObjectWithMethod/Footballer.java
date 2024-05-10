package ObjectWithMethod;

public class Footballer {

	private String Name;
	private String Club;
	private int Salary;
	private String Country;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClub() {
		return Club;
	}
	public void setClub(String club) {
		Club = club;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Footballer [Name=" + Name + ", Club=" + Club + ", Salary=" + Salary + ", Country=" + Country + "]";
	}
	

}
