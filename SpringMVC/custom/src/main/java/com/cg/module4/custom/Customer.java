package com.cg.module4.custom;

public class Customer {

    private int id;
    private String name;
    private String email;
    private String address;

    // Constructor
    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    // Getters and setters for the fields (id, name, email, address)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Assuming you have a customerService instance available
    private CustomerService customerService; // Assuming this is your service class

    // Constructor injection for CustomerService
    public Customer(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Method to update customer
    public String updateCustomer(Customer customerToUpdate) {
        customerService.save(customerToUpdate);
        return "redirect:/customers";
    }
}

