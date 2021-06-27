package com.springboot.jpa.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.jpa.entity.Product;
import com.springboot.jpa.repository.ProductRepository;
import com.springboot.jpa.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;

	@PostMapping("/addProduct")
	
	public Product addProduct(@RequestBody Product product) {
		System.out.println("asndgsefdh" + product.toString());
		return productService.saveProduct(product);

	}

	@PostMapping("/addAllProduct")
	
	public List<Product> addAllProduct(@RequestBody List<Product> product) {
		System.out.println("asndgsefdh" + product.toString());
		return productService.saveAllProduct(product);

	}

	@GetMapping("/getBookById/{id}")
	public Optional<Product> getBookById(@PathVariable int id) {
		return productService.getProduct(id);

	}

	@GetMapping("/getBookByName/{bookName}")
	public Product getBookByName(@PathVariable String bookName) {
		return productService.getProductbyName(bookName);

	}
	@PutMapping("updateBookById/{id}")
	public Product updateProject(@PathVariable int id, @RequestBody Product product) {
		return productService.updateProduct(id,product);
		
	}

}
