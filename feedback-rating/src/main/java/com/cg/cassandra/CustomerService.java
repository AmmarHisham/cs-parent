package com.cg.cassandra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cassandra.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public Customer saveData(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> getData(String productId) {
		return customerRepository.findByProductId(productId);
	}

}
