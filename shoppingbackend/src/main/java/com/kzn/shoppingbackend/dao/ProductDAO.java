package com.kzn.shoppingbackend.dao;

import java.util.List;

import com.kzn.shoppingbackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	// Business Method

	List<Product> listofActiveProduct();
	List<Product> listofActiveProductByCategory(int categoryId);
	List<Product> getLatestActiveProduct(int count);
}
