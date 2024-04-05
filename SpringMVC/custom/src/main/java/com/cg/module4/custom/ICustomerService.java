package com.cg.module4.custom;

import java.util.List;

public interface ICustomerService {
    void save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();

    Customer findById(Long id);

    void delete(Customer customer);
}
