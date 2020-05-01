package com.order.service;

import java.util.List;

import com.order.model.Product;

public interface ProductService {

	public void addProduct(Product p);

	public List<Product> getProducts();

	public int editProduct(Product product);

	public Product getProductById(int pid);

}
