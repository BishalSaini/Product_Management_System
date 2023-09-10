package com.productManagementSystem.Customer_controller;

import com.productManagementSystem.dto.CustomerDto;
import com.productManagementSystem.service.CustomerService;

public class Customer_Insert_Controller { 
	public static void main(String[]args) {
		CustomerDto customer =new CustomerDto();
		customer.setId(2);
		customer.setName("Sabaat");
		customer.setEmail("sabaat@mail;.com");
		customer.setPid(3);
	
	CustomerService customerService=new CustomerService();
	CustomerDto cd= customerService.saveCustomer(customer);
	if(cd!=null) {
	System.out.println(cd.getId() +" "+ "Saved Successfully");
	} 
	}
}
