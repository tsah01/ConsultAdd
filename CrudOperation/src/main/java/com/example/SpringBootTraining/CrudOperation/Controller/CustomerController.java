package com.example.SpringBootTraining.CrudOperation.Controller;

import com.example.SpringBootTraining.CrudOperation.Model.Customer;
import com.example.SpringBootTraining.CrudOperation.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public Customer saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }
    @GetMapping("/getAll")
    public List<Customer> displayCustomer() {
        List<Customer> allCustomer = (List<Customer>)customerService.displayCustomer();
        return allCustomer;
    }

}
