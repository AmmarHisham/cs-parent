package com.cg.cassandra.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cg.cassandra.Customer;

public interface CustomerRepository extends CassandraRepository<Customer> {

	// @Query(value = "SELECT * FROM customer WHERE firstname=?0")
	// public List<Customer> findByFirstname(String firstname);
	//
	// @Query("SELECT * FROM customer WHERE age > ?0 ALLOW FILTERING")
	// public List<Customer> findCustomerHasAgeGreaterThan(int age);

	public List<Customer> findByProductId(String pid);
}
