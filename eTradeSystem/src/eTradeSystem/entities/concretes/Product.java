package eTradeSystem.entities.concretes;

import eTradeSystem.entities.abstracts.Entity;

public class Product implements Entity{
	 private int id;
	 private int categoryId;
	 private String productName;
	 private String description;
	 private double price;
	 
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, int categoryId, String productName, String description, double price) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	 
}
