package com.nestor.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.nestor.entity.Product;

public interface ProductService {
	
	public String add(Product product, List<MultipartFile> productImages);
	
	public void update(Product product);
	
	public void deleteById(String id);
	
	public List<Product> findAll();
}
