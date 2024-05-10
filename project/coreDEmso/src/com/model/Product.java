package com.model;

public class Product {
    private int id;
    private String name;
    private String company;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String company, double price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
    }

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    // Getters and setters
    
}
