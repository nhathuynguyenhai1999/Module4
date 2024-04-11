package com.codegym.springboot.springbootcustomermanagement.Controller;

import com.codegym.springboot.springbootcustomermanagement.Model.Customer;
import com.codegym.springboot.springbootcustomermanagement.Service.ImplCustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class HomeController {
    private final ImplCustomerService implCustomerService;

    public HomeController(ImplCustomerService implCustomerService) {
        this.implCustomerService = implCustomerService;
    }

    @GetMapping(value = "/home")
    public String home(Model model){
        List<Customer> customerList = implCustomerService.getALl();
        model.addAttribute("customer",customerList);
        return "home";
    }

    @GetMapping(value = "/customer")
    public String getById(@RequestParam Long id, Model model){
        Customer customer = implCustomerService.findId(id);
        model.addAttribute("customer",customer);
        return "home";
    }
}
