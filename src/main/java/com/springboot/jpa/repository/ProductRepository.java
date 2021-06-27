package com.springboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String id);

}
