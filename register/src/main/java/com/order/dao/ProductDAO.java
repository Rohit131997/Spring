package com.order.dao;

import org.springframework.stereotype.Repository;

import com.order.model.Product;

@Repository
public interface ProductDAO {
	
	public int registerUser(Product p);

	public String loginUser(Product p);

	public void addProduct(Product p);


}
