package com.javatechie.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.demo.entity.Product;
import com.javatechie.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;

	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {

		return productservice.saveProduct(product);
	}

	@PostMapping("/addproducts")
	public List<Product> addProducts(@RequestBody List<Product> product) {

		return productservice.saveProducts(product);
	}

	@GetMapping("/allproducts")
	public List<Product> findAllProducts() {

		return productservice.getProducts();
	}

	@GetMapping("/productbyid/{id}")
	public Product findProductById(@PathVariable int pId) {

		return productservice.getProductByPid(pId);
	}

	/*
	 * @GetMapping("/productbyname/{nmae}") public Product
	 * findProductByName(@PathVariable String pName) {
	 * 
	 * return productservice.getProductByPname(pName); }
	 */

	@PutMapping("/updateproduct")
	public Product updateProduct(Product product) {

		return productservice.updateProduct(product);
	}

	@DeleteMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable int pId) {

		return productservice.deleteProduct(pId);
	}

}
