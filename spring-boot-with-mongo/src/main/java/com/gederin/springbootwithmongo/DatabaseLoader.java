package com.gederin.springbootwithmongo;


import com.gederin.springbootwithmongo.model.Customer;
import com.gederin.springbootwithmongo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DatabaseLoader {

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
