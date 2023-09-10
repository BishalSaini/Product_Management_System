package com.productManagementSystem.service;

import com.productManagementSystem.dao.CustomerDao;
import com.productManagementSystem.dto.CustomerDto;
import com.productManagementSystem.dto.ProductDto;

public class CustomerService { 
	CustomerDao customerDao = new CustomerDao(); 
	public CustomerDto saveCustomer(CustomerDto customer) { 
	CustomerDto cd = customerDao.saveCustomer(customer);
	return cd;
	} 
	public boolean deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id); 
	}
	public CustomerDto updateCustomerById(CustomerDto customer) { 
		return customerDao.updateCustomerById(customer); 
		}		
	
	public CustomerDto getCustomerById(CustomerDto customer) {
		return customerDao.getCustomerById(customer);
	}
	
	public CustomerDto getAllCustomerById(CustomerDto customer) {
		return customerDao.getAllCustomerById(customer); 
	}
}
