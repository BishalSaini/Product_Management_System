package com.productManagementSystem.Product_controller;

import com.productManagementSystem.dto.ProductDto;
import com.productManagementSystem.service.ProductService;

public class Product_Insert_Controller {
	public static void main(String[]args) {
		ProductDto product =new ProductDto();
		product.setPid(1);
		product.setBrand("DIOR");
		product.setName("Nike Dior x Air Jordan 1");
		product.setPrice(2700000);
	
	ProductService productService=new ProductService();
	ProductDto p= productService.saveProduct(product);
	if(p!=null) {
		System.out.println(p.getPid() +" "+ "Saved Successfully");
	} 
	}
}
