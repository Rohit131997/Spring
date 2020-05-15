package com.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.ProductDAO;
import com.order.model.Product;
import com.order.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productdao;
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		calculatetaxandFinalPrice(p);
		
		productdao.addProduct(p);
		

	}

	private void calculatetaxandFinalPrice(Product p) {
		// TODO Auto-generated method stub
		
		double tax = p.getPrice()*2/100;
		double finalPrice = p.getPrice()+tax;
		p.setTax(tax);
		p.setFinalPrice(finalPrice);
		
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productdao.getProducts();
	}


	@Override
	public int editProduct(Product p) {
		return productdao.editProduct(p);
	}
	

	@Override
	public Product getProductById(int pid) {
		return productdao.getProductById(pid);

}
}
