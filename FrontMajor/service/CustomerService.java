package com.cg.springboot.MajorProject.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.springboot.MajorProject.bean.Customer;
import com.cg.springboot.MajorProject.repo.ICustomerRepo;
@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	private ICustomerRepo repo;

	
	@Override
	public Optional<Customer> getCustomerById(int cid) {
		return repo.findById(cid);
	}


	@Override
	public long getCode(Customer c) {
	long ref= (long)(Math.random() * 10000 + 999999);
	System.out.println();
	c.setRef_code(ref);
	repo.save(c);
	return c.getRef_code();
	}

	/*@Override
	public void addCustomerCode(Customer c) {
		repo.addCustomerCode(c);
		
	}
*/
	
	


	
}
