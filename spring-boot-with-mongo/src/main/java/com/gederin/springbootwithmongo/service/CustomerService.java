package com.gederin.springbootwithmongo.service;

import com.gederin.springbootwithmongo.model.Customer;
import com.gederin.springbootwithmongo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> fetchAllCustomers() {
        return customerRepository.findAll();
    }
}
