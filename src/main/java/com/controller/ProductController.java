package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.ProductBean;

@RestController
public class ProductController {

	@PostMapping("/products")
	public ProductBean saveProduct(ProductBean product) {
		return product;// json

	}
}
