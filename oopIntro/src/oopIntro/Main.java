package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1);
		product1.setProductName("Lenovo V15");
		product1.setUnitPrice(16000);
		product1.setDiscount(10);
		System.out.println(product1.getUnitPriceAfterDiscount());
		
	Category category1 = new Category();
	category1.setId(1);
	category1.setCategoryName("Ýçecek");
	Category category2 = new Category();
	category2.setId(2);
	category2.setCategoryName("Ev Eþyalarý");
	
	System.out.println(category1.getCategoryName());
	System.out.println(category2.getCategoryName());
	
		
	}

}
