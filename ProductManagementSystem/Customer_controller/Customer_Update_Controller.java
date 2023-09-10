package com.productManagementSystem.Customer_controller;

import com.productManagementSystem.dto.CustomerDto;
import com.productManagementSystem.service.CustomerService;

public class Customer_Update_Controller { 
public static void main(String[] args) {
		
		CustomerDto customer = new CustomerDto();
		customer.setId(1);
		customer.setName("Vishu");
		customer.setEmail("vishu32@mail.com");	
		CustomerService customerService = new CustomerService();
		CustomerDto cd = customerService.updateCustomerById(customer);
		if(cd!=null) {
			System.out.println(cd.getId() + " Updated Successfully");
		}	
	}
}
