package com.gederin.springbootwithmongo.controller;

import com.gederin.springbootwithmongo.model.Customer;
import com.gederin.springbootwithmongo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping ("/all")
    public List<Customer> fetchAllCustomers(){
        return customerService.fetchAllCustomers();
    }
}
