package com.sneha.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import com.sneha.demo.database.DatabaseClass;
import com.sneha.demo.model.Customer;

public class CustomerService {
		
	private Map<Long,Customer> customerList = DatabaseClass.getData();

	public CustomerService() {
		customerList.put(1L,new Customer(1,"Jane","DXC"));
		customerList.put(2L,new Customer(2,"Max","HP"));
	}
	
	public List<Customer> getAllCustomers(){
	 return new ArrayList<Customer>(customerList.values());
	}
	
	public Customer getCustomer(long id) {
			return customerList.get(id);
	}
	
	public Customer addCustomer(Customer customer) {
		customer.setId(customerList.size() + 1);
		customerList.put(customer.getId(), customer);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer) {
		if(customer.getId()<=0) {
			return null;
		}
		customerList.put(customer.getId(), customer);
		return customer;
	}
	
	public void removeCustomer(long id) {
		customerList.remove(id);
	}
}
