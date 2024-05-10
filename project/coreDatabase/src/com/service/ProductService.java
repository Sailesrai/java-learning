package com.service;

import java.util.List;
import com.model.Product;
import com.model.Product2;
public interface ProductService {

	void addProduct(Product2 p); 
	void deleteProduct(int index);
	List<Product> getAllProducts();
	void updateProduct(Product2 p);

	
}
