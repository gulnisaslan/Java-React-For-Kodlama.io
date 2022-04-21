package nLayyeredDemo1.dataAccess.concretes;

import java.util.List;


import nLayyeredDemo1.dataAccess.abstracts.ProductDao;
import nLayyeredDemo1.entities.concretes.Product;

public class AbcProductDao implements ProductDao {



	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void add(Product product) {
		System.out.println("Abc İle Eklendi: "+product.getName());
	}

}
