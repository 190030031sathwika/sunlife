package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDAO;
import com.dao.ProductImpl;
import com.entity.Product;

@RestController
@RequestMapping("/Product")
public class AppController {
	
	@Autowired
	private ProductDAO dao;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product){
		Product p=dao.addProduct(product);
		return  p;
	}
	@GetMapping("/loadproducts")
	public List<Product> showProducts(){
		return dao.loadProducts();
	}
	@GetMapping("/loadproducts/{plist}")
	public List<Product>loadProductsByIds(@PathVariable List<Long> plist){
		return dao.getByIds(plist);
	}
}
