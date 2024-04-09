package com.codegym.module4.customerormjpa.service.impl;

import com.codegym.module4.customerormjpa.model.Customer;
import com.codegym.module4.customerormjpa.repository.CustomerRepository;
import com.codegym.module4.customerormjpa.service.ImplCustomer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServer implements ImplCustomer {

    private final CustomerRepository customerRepository;

    public CustomerServer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
