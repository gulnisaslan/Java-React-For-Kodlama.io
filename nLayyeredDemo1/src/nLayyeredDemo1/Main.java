package nLayyeredDemo1;

import nLayyeredDemo1.business.abstracts.ProductService;
import nLayyeredDemo1.business.concrete.ProductManager;
import nLayyeredDemo1.core.JLoggerManagerAdapter;
import nLayyeredDemo1.dataAccess.concretes.AbcProductDao;
import nLayyeredDemo1.dataAccess.concretes.HibernateProductDao;
import nLayyeredDemo1.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo =Spring IoC ile çözülecek
	ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
	Product product=new Product(1,2,"Elma",12,50);
	productService.add(product);
		
	}
}


