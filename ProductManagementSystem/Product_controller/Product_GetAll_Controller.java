package com.productManagementSystem.Product_controller;

import com.productManagementSystem.dto.ProductDto;
import com.productManagementSystem.service.ProductService;

public class Product_GetAll_Controller { 
public static void main(String[] args) {
		ProductDto product = new ProductDto();
		ProductService productService = new ProductService();
		productService.getAllProductByPid(product);
	}
}
