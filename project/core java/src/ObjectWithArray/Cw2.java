package ObjectWithArray;
/*
 * 
	 * Q> WAP to store and print data 
	 *    of 10 Employees(id,name,company,salary,department,post,city):
	 *    
	 *    a> find total salary of employee.
	 *    b> print employees of IT department.
	 *    c> count employees of Admin department.
	 *    d> count and print employees of particular city.
	 *    e> calculate total salary of particular department.
	 *    f> find highest and lowest salary of employee.
	 */

public class Cw2 {
	 
	private int id; 
    private String Name;
    private String company;
    private int salary;
    private String department;
    private String post;
    private String city;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
	@Override
	public String toString() {
		return "cw2 [id=" + id + ", Name=" + Name + ", company=" + company + ", salary=" + salary + ", department="
				+ department + ", post=" + post + ", city=" + city + "]";
}
	}
