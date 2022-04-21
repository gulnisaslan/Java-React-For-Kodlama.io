package eTradeSystem.dataAccess.concretes.hibernate;

import java.util.List;

import eTradeSystem.dataAccess.abstracts.ProductDao;
import eTradeSystem.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println(product.getProductName()+" adlý ürün eklendi.");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getProductName()+" adlý ürün silindi.");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName()+" adlý ürün güncellendi.");
	}

	@Override
	public void getId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
