package com.productManagementSystem.Customer_controller;

import com.productManagementSystem.dto.CustomerDto;
import com.productManagementSystem.service.CustomerService;

public class Customer_Get_Controller { 
	public static void main(String[] args) {
		CustomerDto customer = new CustomerDto();
		customer.setId(1);
		CustomerService customerService = new CustomerService();
		customerService.getCustomerById(customer);		
	} 

}
