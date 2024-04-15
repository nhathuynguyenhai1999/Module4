package com.codegym.module4.aspectcustomer.service;

import com.codegym.module4.aspectcustomer.model.Customer;
//import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);
}
