package com.cg.springboot.MajorProject.service;

import java.util.Optional;

import com.cg.springboot.MajorProject.bean.Customer;

public interface ICustomerService {
	public long getCode(Customer c);
	Optional<Customer> getCustomerById(String customer_email);
	
}
