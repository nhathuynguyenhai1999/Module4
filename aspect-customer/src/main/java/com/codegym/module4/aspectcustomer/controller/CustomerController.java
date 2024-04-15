package com.codegym.module4.aspectcustomer.controller;

import com.codegym.module4.aspectcustomer.model.Customer;
import com.codegym.module4.aspectcustomer.repository.CustomerRepository;
import com.codegym.module4.aspectcustomer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping
    public ModelAndView showListCustomers(){
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customers", customerList);
        return modelAndView;
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("Customers", new Customer());
        return "create";
    }
    @PostMapping("/")
    public ModelAndView showInputNotAcceptable(){
        return new ModelAndView();
    }
}
