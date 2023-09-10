package com.productManagementSystem.Product_controller;

import com.productManagementSystem.dto.ProductDto;
import com.productManagementSystem.service.ProductService;

public class Product_Update_Controller { 
public static void main(String[] args) {
		ProductDto product = new ProductDto();
		product.setPid(2); 
		product.setBrand("DIOR");
		product.setName("X Dior low sneakers");
		product.setPrice(250000O);

		ProductService productService = new ProductService();
		ProductDto p = productService.updateProductByPid(product);		
		if(p!=null) {
			System.out.println(p.getPid() + " Updated Sucessfull");
		}
	}
}
