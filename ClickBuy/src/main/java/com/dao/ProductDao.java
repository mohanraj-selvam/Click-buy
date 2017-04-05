package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao
{

	void addProduct(Product product);
	List<Product> getAllProducts();
	public Product getById(int id);
	public void deleteById(int id);
	public void editProduct(int id,Product p);
	
}
