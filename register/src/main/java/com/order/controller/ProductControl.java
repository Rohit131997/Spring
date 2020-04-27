package com.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.order.model.Product;
import com.order.service.ProductService;

@Controller

public class ProductControl {
	 ProductService productService;

	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("userReg") Product p) {

		return "addProduct";
	}

	@RequestMapping("/result")
	public String processUserRegistration(@ModelAttribute("userReg") Product p) {

		 productService.addProduct(p);

		return "result";
	}

}