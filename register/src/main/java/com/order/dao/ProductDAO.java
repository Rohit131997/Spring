package com.order.dao;

import java.util.List;
import com.order.model.Product;

public interface ProductDAO {

	public int addProduct(Product p);

	public List<Product> getProducts();

	public int editProduct(Product product);

	public Product getProductById(int pid);

}
