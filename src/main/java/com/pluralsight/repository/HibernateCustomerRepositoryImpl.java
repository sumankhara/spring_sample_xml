package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String dbUsername;
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
	public List<Customer> findAll(){
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Suman");
		customer.setLastname("Khara");
		
		customers.add(customer);
		
		return customers;
	}
}
