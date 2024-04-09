package com.codegym.module4.customerormjpa.controller;

import com.codegym.module4.customerormjpa.model.Customer;
import com.codegym.module4.customerormjpa.service.impl.CustomerServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("")
public class HomeController {

    private final CustomerServer customerServer;

    public HomeController(CustomerServer customerServer) {
        this.customerServer = customerServer;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(Model model) {
        List<Customer> customers = customerServer.getAll();
        model.addAttribute("cus", customers);
        return "home";
    }
}
