package oopIntro;

public class Product {
	
	public int id;
	private  String productName;
	private  double unitPrice;
	private  String description;
	private double discount;
	private double unitPriceAfterDiscount;
	
	


	public Product() {
		
	}
	
	public Product(int id, String productName, double unitPrice, String description,double discount) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.description = description;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	
	
	


}
