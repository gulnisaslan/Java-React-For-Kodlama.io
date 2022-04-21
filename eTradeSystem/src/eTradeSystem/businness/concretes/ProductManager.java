package eTradeSystem.businness.concretes;

import java.util.List;

import eTradeSystem.businness.abstracts.ProductService;
import eTradeSystem.dataAccess.abstracts.ProductDao;
import eTradeSystem.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		System.out.println(product.getProductName()+ " ürün eklendi.");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getProductName()+ " ürün silindi.");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName()+ " ürün güncellendi.");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
