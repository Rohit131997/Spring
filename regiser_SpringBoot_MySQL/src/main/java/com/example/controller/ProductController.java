package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.Product;
import com.example.service.ProductServiceImp;


@RestController
public class ProductController {

	@Autowired
	private ProductServiceImp productService;

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();

	}

	@RequestMapping("/products/{pId}")
	public Product getProduct(@PathVariable int pId) {
		return productService.getProductById(pId);

	}
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/products/{pId}")
	public void updateProduct(@RequestBody Product product,@PathVariable int pId) {
		productService.updateProduct(product);;
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{pId}")
	public void deleteProduct(@PathVariable int pId) {
		 productService.deleteProduct(pId);;

	}

}