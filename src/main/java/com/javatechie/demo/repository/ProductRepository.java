package com.javatechie.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByPname(String pname);
	
	

}
