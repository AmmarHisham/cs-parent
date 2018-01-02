package com.cg.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.models.Response;

@RestController
public class CassandraController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/saveUser/data", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Response saveData(@RequestBody Customer customer) {
		customerService.saveData(customer);
		Response r=new Response();
		return r.description("success");

		

	}

}
