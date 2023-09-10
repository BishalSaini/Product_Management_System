package com.productManagementSystem.service;

import com.productManagementSystem.dao.ProductDao;
import com.productManagementSystem.dto.ProductDto;


public class ProductService {
	ProductDao productDao = new ProductDao(); 
	public ProductDto saveProduct(ProductDto product) { 
	ProductDto p = productDao.saveProduct(product);
	return p;
	} 
	public boolean deleteProductByPid(int Pid) {
		return productDao.deleteProductByPid(Pid); 
	}
	public ProductDto updateProductByPid(ProductDto product) { 
		return productDao.updateProductByPid(product); 
		}		
	
	public ProductDto getProductByPid(ProductDto product) {
		return productDao.getProductByPid(product);
	}
	
	public ProductDto getAllProductByPid(ProductDto product) {
		return productDao.getAllProductByPid(product);
	}
}