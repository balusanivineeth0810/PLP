package com.cg.springboot.MajorProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springboot.MajorProject.bean.Customer;
import com.cg.springboot.MajorProject.service.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	ICustomerService service;

	@RequestMapping("/getcode")
	public Optional<Customer> getCustomerById(@RequestParam String customer_email) {

		Optional<Customer> customer = service.getCustomerById(customer_email);

		return customer;

	}

}