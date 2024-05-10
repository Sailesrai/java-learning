package com.model;

public class Product {
    private int id;
    private String name;
    private String company;
    private int price;
	public Product(int id2, String name2, String company2, int price2) {
		// TODO Auto-generated constructor stub
        this.id = id2;
        this.name = name2;
        this.company = company2;
        this.price = price2;

	}

	public int getId() {
		return id;
	}

	  // Constructor to initialize all attributes
//	  public Product(int id, String name, String company, int price) {
//	        this.id = id;
//	        this.name = name;
//	        this.company = company;
//	        this.price = price;
//	    }

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n Product [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
    
    
	
}   
