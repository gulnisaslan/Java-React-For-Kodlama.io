package eTradeSystem.businness.abstracts;

import java.util.List;

import eTradeSystem.entities.concretes.Product;

public interface ProductService {
    
    void add(Product product);
    
    void delete(Product product);
     
    void update(Product product);
    
    List<Product> getAll();
    
    Product get(int id);
}
