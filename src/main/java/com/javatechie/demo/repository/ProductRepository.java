package com.javatechie.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	//Product findByPname(String pname);

}
