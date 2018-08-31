package com.cg.springboot.MajorProject.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.springboot.MajorProject.bean.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, String> {
	
}
