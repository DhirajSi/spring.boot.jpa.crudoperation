package com.springboot.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.jpa.entity.Product;
import com.springboot.jpa.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> saveAllProduct(List<Product> product) {
		return productRepository.saveAll(product);
	}

	public Optional<Product> getProduct(int id) {
		return productRepository.findById(id);
	}

	public Product getProductbyName(String name) {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" + productRepository.findByName(name));
		return productRepository.findByName(name);
	}

	public Product updateProduct(int id,Product product) {

		Product book = productRepository.findById(id).orElse(null);
		book.setName(product.getName());
		book.setPrice(product.getPrice());
		book.setQuantity(product.getQuantity());
		return productRepository.save(book);

	}

}
