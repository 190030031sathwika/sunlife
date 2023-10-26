package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repo.ProductREPO;

@Repository
public class ProductImpl implements ProductDAO{
	
	@Autowired
	private ProductREPO repo;
	
	@Override
	public Product addProduct(Product product) {
		repo.save(product);
		return product;
	}
	@Override
	public List<Product> loadProducts(){
		return (List<Product>) repo.findAll();
	}
	@Override
	public List<Product> getByIds(List<Long> plist){
		return (List<Product>) repo.findAllById(plist);
	}
}
