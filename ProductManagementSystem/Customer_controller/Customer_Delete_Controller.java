package com.productManagementSystem.Customer_controller;

import com.productManagementSystem.service.CustomerService;

public class Customer_Delete_Controller { 
	public static void main(String[] args) {
		CustomerService customerService= new CustomerService();
		boolean res= customerService.deleteCustomerById(2);
		System.out.println(res);
	}


}
