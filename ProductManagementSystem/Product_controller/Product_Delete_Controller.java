package com.productManagementSystem.Product_controller;

import com.productManagementSystem.service.ProductService;

public class Product_Delete_Controller { 
	public static void main(String[] args) {
		ProductService productService= new ProductService();
		boolean res= productService.deleteProductByPid(1);
		System.out.println(res);
	}

}
