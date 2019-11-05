package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.CustomerRepository;
import com.example.demo.model.Customer;

@RestController
public class CustomerResource {
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping(value="/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getcustomers() {
	return	customerRepository.findAll();
	}
	@GetMapping(value="/all/{firstname}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getcustomers(@PathVariable("firstname") String firstname) {
	return	customerRepository.findByFirstName(firstname);
	}
	@PostMapping(value="/save",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer saveCustomer(@RequestBody Customer customer) {
	return	customerRepository.save(customer);
	}
	
	

}
