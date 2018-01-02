package com.cg.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cassandra.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public String saveData(Customer cust) {
	
		Customer cust_1 = new Customer();

		cust_1.setAge(cust.getAge());
		cust_1.setFirstname(cust.getFirstname());
		cust_1.setId(cust.getId());
		cust_1.setLastname(cust.getLastname());
		cust_1.setFeedback(cust.getFeedback());
		cust_1.setRating(cust.getRating());
		customerRepository.save(cust_1);
		return "success";

	}

}
