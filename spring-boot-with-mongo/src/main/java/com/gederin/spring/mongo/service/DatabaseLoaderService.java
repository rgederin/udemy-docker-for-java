package com.gederin.spring.mongo.service;


import com.gederin.spring.mongo.model.Customer;
import com.gederin.spring.mongo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DatabaseLoaderService {

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    private void initDatabase() {
        customerRepository.deleteAll();

        Customer customer = new Customer("Alex", "sunches");
        customerRepository.save(customer);

        customer = new Customer("Adam", "Nickol");
        customerRepository.save(customer);
    }
}
