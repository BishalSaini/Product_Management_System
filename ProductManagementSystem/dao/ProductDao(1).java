package com.productManagementSystem.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.productManagementSystem.configuration.HelperClass;
import com.productManagementSystem.dto.ProductDto;

	public class ProductDao {
		
		HelperClass helperClass = new HelperClass();
		Connection connection = null;
			
		// to save data
		public ProductDto saveProduct(ProductDto product) {
			connection = helperClass.getConnection();
			String sql = "INSERT INTO product VALUES(?,?,?,?)";
			
				try {
					// create statement
					PreparedStatement preparedstatement = connection.prepareStatement(sql);
					
					//passed the values to delimiters/placeholder ---> ???
					preparedstatement.setInt(1, product.getPid());
					preparedstatement.setString(2, product.getBrand());
					preparedstatement.setString(3, product.getName());
					preparedstatement.setFloat(4, product.getPrice());
					
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
				
			return product;
					
		} 
	//  to delete  data
			public boolean deleteProductByPid(int pid) {
				connection = helperClass.getConnection();
				String sql = "DELETE FROM product WHERE PID=?";
				
					try {		
						PreparedStatement preparedStatement = connection.prepareStatement(sql);
						preparedStatement.setInt(1, pid);
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
				if(pid>0) {
					return true;
				}
				else {
					return false;
				}	
				
			}
			
			// to update data
			public ProductDto updateProductByPid(ProductDto product) {	
				connection = helperClass.getConnection();
				String sql = "UPDATE product SET name=? ,price=? WHERE PID =?";
			
					try {
						PreparedStatement preparedStatement = connection.prepareStatement(sql);
									
						preparedStatement.setString(1, product.getName());
						preparedStatement.setFloat(2, product.getPrice());
						preparedStatement.setInt(3, product.getPid());
										
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
				return product;
				
			}
			// to get data 
			public ProductDto getProductByPid(ProductDto product) {
				
				connection = helperClass.getConnection();

				String sql = "SELECT * FROM product WHERE PID = ?";
				
			
					try {
						
						PreparedStatement preparedStatement = connection.prepareStatement(sql);
						
						preparedStatement.setInt(1,product.getPid());
				
						ResultSet resultSet = preparedStatement.executeQuery();
						while(resultSet.next()) {
							System.out.println(resultSet.getInt(1));
							System.out.println(resultSet.getString(2));
							System.out.println(resultSet.getString(3));
							System.out.println(resultSet.getFloat(4));
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
					return product;
					
			}
			
			// to get all the records 
			public ProductDto getAllProductByPid(ProductDto product) {
				connection = helperClass.getConnection();
				String sql = "SELECT * FROM product";
					try {
						
						PreparedStatement preparedStatement = connection.prepareStatement(sql);
						
						ResultSet resultSet = preparedStatement.executeQuery();
						
						while(resultSet.next()) {
							System.out.println(resultSet.getInt(1));
							System.out.println(resultSet.getString(2));
							System.out.println(resultSet.getString(3));
							System.out.println(resultSet.getFloat(4));
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
					return product;
					
			}	 

		
		
	}


