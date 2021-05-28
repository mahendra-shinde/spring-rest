package com.mahendra.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.models.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerResource {

	@GetMapping(produces =MediaType.APPLICATION_JSON_VALUE)
	public Customer findCustomer() {
		Customer customer = new Customer();
		customer.setFirstName("Mahendra");
		customer.setLastName("Shinde");
		customer.setPhone("6576575765");
		return customer;
	}
}
