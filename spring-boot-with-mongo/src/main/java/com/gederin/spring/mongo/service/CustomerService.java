package com.gederin.spring.mongo.service;

import com.gederin.spring.mongo.repository.CustomerRepository;
import com.gederin.spring.mongo.model.Customer;

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

    public Customer fetchCustomerByFirstName(String firstName){
        return customerRepository.findByFirstName(firstName);
    }
}
