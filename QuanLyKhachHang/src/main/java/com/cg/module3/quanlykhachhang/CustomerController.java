package com.cg.module3.quanlykhachhang;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController{
    @GetMapping("/customers")
    public String showList(Model model){
        List<Customer> customers = customerService.findAll();
        return "customers/list.jsp";
    }
}