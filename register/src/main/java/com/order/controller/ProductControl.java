package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.order.model.Product;
import com.order.service.ProductService;

@Controller
public class ProductControl {
	@Autowired
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

	@RequestMapping("/viewProducts")
	public String viewProducts(Model model) {
		List<Product> list = productService.getProducts();
		model.addAttribute("list", list);
		return "viewProducts";
	}

	@RequestMapping(value = "/editProduct/{productId}")
	public String edit(@PathVariable int pid, Model model) {
		Product product = productService.getProductById(pid);
		model.addAttribute("command", product);
		return "editProduct";
	}

	/* It updates model object. */
	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public String editProducts(@ModelAttribute("product") Product product) {
		productService.addProduct(product);
		return "redirect:/viewProducts";
	}

}
