package com.cg.cassandra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feedback")
public class CassandraController {
	@Autowired
	CustomerService customerService;

	@PostMapping("create")
	public Customer saveData(@RequestBody Customer customer) {
		return customerService.saveData(customer);
	}

	@GetMapping(value = "getbypid", params = { "productId" })
	public List<Customer> getData(@RequestParam(value = "productId", required = true) String productId) {
		return customerService.getData(productId);
	}

}
