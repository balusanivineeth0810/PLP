package com.cg.springboot.MajorProject.service;

import java.util.Optional;

import com.cg.springboot.MajorProject.bean.Customer;

public interface ICustomerService {

	//public void addCustomerCode(Customer c);

	public  Optional<Customer> getCustomerById(int cid);
	public long getCode(Customer c);
	
}
