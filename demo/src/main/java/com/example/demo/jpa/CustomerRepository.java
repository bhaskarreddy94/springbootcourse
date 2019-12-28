package com.example.demo.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{	
List<Customer> findByFirstName(String firstname);
List<Customer> findByLastName(String lastName);
}
