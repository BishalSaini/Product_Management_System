package com.productManagementSystem.Customer_controller;

import com.productManagementSystem.dto.CustomerDto;
import com.productManagementSystem.service.CustomerService;

public class Customer_GetAll_Controller {  
	public static void main(String[] args) {
		CustomerDto customer = new CustomerDto();
		CustomerService customerService = new CustomerService();
		customerService.getAllCustomerById(customer);
	}
}
