package com.productManagementSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.productManagementSystem.configuration.HelperClass;
import com.productManagementSystem.dto.CustomerDto;
import com.productManagementSystem.dto.ProductDto;

public class CustomerDao { 
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
		
	// to save data
	public CustomerDto saveCustomer(CustomerDto customer) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO customer VALUES(?,?,?,?)";
		
			try {
				// create statement
				PreparedStatement preparedstatement = connection.prepareStatement(sql);
				
				//passed the values to delimiters/placeholder ---> ???
				preparedstatement.setInt(1, customer.getId());
				preparedstatement.setString(2,customer.getName());
				preparedstatement.setString(3,customer.getEmail());
				preparedstatement.setInt(4,customer.getPid());
				
				//execute
				preparedstatement.execute();		
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		return customer;
				
	} 
//  to delete  data
		public boolean deleteCustomerById(int id) {
			connection = helperClass.getConnection();
			String sql = "DELETE FROM customer WHERE ID=?";
			
				try {		
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setInt(1, id);
					 int i = preparedStatement.executeUpdate();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
				finally {
					try {
						connection.close();
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			if(id>0) {
				return true;
			}
			else {
				return false;
			}	
			
		}
		
		// to update data
		public CustomerDto updateCustomerById(CustomerDto customer) {	
			connection = helperClass.getConnection();
			String sql = "UPDATE customer SET name=? ,email=? WHERE ID =?";
		
				try {
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
								
					preparedStatement.setString(1, customer.getName());
					preparedStatement.setString(2, customer.getEmail());
					preparedStatement.setInt(3, customer.getId());
									
					int i =preparedStatement.executeUpdate();
					
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
				finally {
					try {
						connection.close();
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			return customer;
			
		}
		// to get data 
		public CustomerDto getCustomerById(CustomerDto customer) {
			connection = helperClass.getConnection();
			String sql = "SELECT * FROM customer WHERE ID = ?";
	
				try {
					
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					
					preparedStatement.setInt(1,customer.getId());
			
					ResultSet resultSet = preparedStatement.executeQuery();
					while(resultSet.next()) {
						System.out.println(resultSet.getInt(1));
						System.out.println(resultSet.getString(2));
						System.out.println(resultSet.getString(3));
						System.out.println(resultSet.getInt(4));
					}					
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
				finally {
					try {
						connection.close();
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return customer;
				
		}
		
		// to get all the records 
		public CustomerDto getAllCustomerById(CustomerDto customer) {
			connection = helperClass.getConnection();
			String sql = "SELECT * FROM customer";
				try {
					
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					
					ResultSet resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()) {
						System.out.println(resultSet.getInt(1));
						System.out.println(resultSet.getString(2));
						System.out.println(resultSet.getString(3));
						System.out.println(resultSet.getInt(4));
						System.out.println("===========================");
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
				finally {
					try {
						connection.close();
						System.out.println("All Good");
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return customer;
				
		}	 	
}
