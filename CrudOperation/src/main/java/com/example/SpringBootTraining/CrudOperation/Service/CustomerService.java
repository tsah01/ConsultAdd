package com.example.SpringBootTraining.CrudOperation.Service;

import com.example.SpringBootTraining.CrudOperation.Model.Customer;
import com.example.SpringBootTraining.CrudOperation.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService  {
    @Autowired
    private CustomerRepository customerRepository;


    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);
    }


    public List<Customer> displayCustomer() {
        List<Customer> allCustomer = customerRepository.findAll();
        return allCustomer;
    }



}
