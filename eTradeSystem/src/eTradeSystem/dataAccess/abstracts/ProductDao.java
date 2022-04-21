package eTradeSystem.dataAccess.abstracts;

import java.util.List;

import eTradeSystem.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	void getId(int id);
	List<Product> getAll();

}
