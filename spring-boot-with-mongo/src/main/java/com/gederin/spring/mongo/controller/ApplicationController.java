package com.gederin.spring.mongo.controller;

import com.gederin.spring.mongo.model.Customer;
import com.gederin.spring.mongo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.gederin.spring.mongo.utils.Constants.CUSTOMERS;
import static com.gederin.spring.mongo.utils.Constants.INDEX;
import static com.gederin.spring.mongo.utils.Constants.MONGO_DATABASE;
import static com.gederin.spring.mongo.utils.Constants.MONGO_HOST;
import static com.gederin.spring.mongo.utils.Constants.MONGO_PORT;

@Controller
public class ApplicationController {

    @Autowired
    private CustomerService customerService;

    @Value("${spring.data.mongodb.host}")
    private String mongoHost;

    @Value("${spring.data.mongodb.port}")
    private String mongoPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoDb;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute(MONGO_HOST, mongoHost);
        model.addAttribute(MONGO_PORT, mongoPort);
        model.addAttribute(MONGO_DATABASE, mongoDb);
        model.addAttribute(CUSTOMERS, customerService.fetchAllCustomers());
        model.addAttribute("customer", new Customer());

        return INDEX;
    }

    @PostMapping("/add")
    public String greetingSubmit(@ModelAttribute Customer customer, Model model) {
        customerService.saveCustomer(customer);

        return "redirect:/";
    }
}
