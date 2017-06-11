package com.gederin.spring.mongo.controller;

import com.gederin.spring.mongo.model.Customer;
import com.gederin.spring.mongo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/rest")
public class ApplicationRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping ("/all")
    public List<Customer> fetchAllCustomers(){
        return customerService.fetchAllCustomers();
    }
}
