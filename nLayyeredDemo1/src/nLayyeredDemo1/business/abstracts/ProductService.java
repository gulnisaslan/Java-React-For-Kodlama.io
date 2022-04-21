package nLayyeredDemo1.business.abstracts;

import java.util.List;

import nLayyeredDemo1.entities.concretes.Product;

public interface ProductService {
     void add(Product product);
     List<Product> getAll();
}
