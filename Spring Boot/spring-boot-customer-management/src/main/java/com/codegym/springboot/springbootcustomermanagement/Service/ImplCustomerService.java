package com.codegym.springboot.springbootcustomermanagement.Service;

import com.codegym.springboot.springbootcustomermanagement.Model.Customer;

import java.util.List;
import java.util.Optional;

public interface ImplCustomerService {

    List<Customer> getALl();

    Customer findId(Long id);
    void delete(Long id);
    void save(Customer customer);
}
