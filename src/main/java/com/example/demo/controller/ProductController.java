package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repositories.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("retre, this is simple project build by Dushko Manev, 196063");
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct() {
		return ResponseEntity.ok(productRepository.findAll());
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
		return ResponseEntity.ok(productRepository.findById(id).get());
	}

	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return ResponseEntity.ok(productRepository.save(product));
	}

}
