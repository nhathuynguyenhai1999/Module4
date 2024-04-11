package com.codegym.springboot.springbootcustomermanagement.Controller;

import com.codegym.springboot.springbootcustomermanagement.Model.Customer;
import com.codegym.springboot.springbootcustomermanagement.Service.ImplCustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping
@RestController
public class CustomerController {

    private final ImplCustomerService implCustomerService;

    public CustomerController(ImplCustomerService implCustomerService) {
        this.implCustomerService = implCustomerService;
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> home(Model model){
        List<Customer> customer = implCustomerService.getALl();
        model.addAttribute("customer", customer);
        return customer;
    }

    @RequestMapping(value = "/customer/id" , method = RequestMethod.GET)
    public Customer findId(@RequestParam Long id){
       return implCustomerService.findId(id);
    }

    @DeleteMapping(value = "/remove")
    public boolean delete(@RequestParam Long id){
        try {
            implCustomerService.delete(id);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
