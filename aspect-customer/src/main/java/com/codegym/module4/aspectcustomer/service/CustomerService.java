package com.codegym.module4.aspectcustomer.service;

import com.codegym.module4.aspectcustomer.model.Customer;
import com.codegym.module4.aspectcustomer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
//        throw new Exception("a dummy exception");
        return customerRepository.findAll();
    }
    @Override
    public void save(Customer customer){
        customerRepository.save(customer);
    }
}
