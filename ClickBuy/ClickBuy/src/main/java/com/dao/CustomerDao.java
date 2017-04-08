package com.dao;

import java.util.List;

import com.model.Customer;

public interface CustomerDao 
{

	public void addCustomer(Customer c);
	public List<Customer> getByName(String name);
}
