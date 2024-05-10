package javaCollection;

public class User { 
	private int id;
	private String name;
	private String Hobby;
	private String phonenum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return Hobby;
	}
	public void setHobby(String hobby) {
		Hobby = hobby;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Hobby=" + Hobby + ", phonenum=" + phonenum + "]";
	}
	 
}
