package com.productManagementSystem.Product_controller;

import com.productManagementSystem.dto.ProductDto;
import com.productManagementSystem.service.ProductService;

public class Product_Get_Controller {  
	public static void main(String[] args) {

		ProductDto product = new ProductDto();
		product.setPid(1);
		ProductService productService = new ProductService();
		productService.getProductByPid(product);		
	} 
}
