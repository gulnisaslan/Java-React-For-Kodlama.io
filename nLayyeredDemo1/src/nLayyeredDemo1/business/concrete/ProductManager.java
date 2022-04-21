package nLayyeredDemo1.business.concrete;

import java.util.List;

import nLayyeredDemo1.business.abstracts.ProductService;
import nLayyeredDemo1.core.LoggerService;
import nLayyeredDemo1.dataAccess.abstracts.ProductDao;
import nLayyeredDemo1.entities.concretes.Product;

public class ProductManager implements ProductService {


	 private ProductDao productDao;
    private LoggerService loggerService;
    
    
    
    
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao =productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
		return;
		}
	    this.productDao.add(product);
	    this.loggerService.logToSystem("Ürün eklendi" + product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
