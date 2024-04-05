package com.cg.module4.custom;

import java.util.ArrayList;
import java.util.List;
public class SimpleCustomerServiceImpl implements ICustomerService {
    private List<Customer> customerList; // Assuming this will hold the customers
    public SimpleCustomerServiceImpl() {
        // Assuming this will hold the customers
        List<Customer> customerList = new ArrayList<>();
    }
    @Override
    public void save(Customer customer) {
        // Implement save logic here
        customerList.add(customer); // Adding the customer to the list
    }
    @Override
        public Customer findById(int id) {
            // Implement find by id logic here
            for (Customer customer : customerList) {
                if (customer.getId() == id) {
                    return customer; // Return the customer if found
                }
            }
            return null; // Return null if customer not found
        }
        @Override
        public List<Customer> findAll() {
            return customerList;
        }
        @Override
        public Customer findById(Long id) {
            return null;
        }

    @Override
    public void delete(Customer customer) {
        // Implement delete logic here
        customerList.remove(customer); // Removing the customer from the list
    }
}
