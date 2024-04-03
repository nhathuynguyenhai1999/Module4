package com.cg.module3.quanlykhachhang;

import org.springframework.web.servlet.ModelAndView;

public ModelAndView showList() {
    ModelAndView modelAndView = new ModelAndView("customers/list.jsp");
    List<Customer> customers = customerService.findAll();
    modelAndView.addObject("customers",customers);
    return modelAndView;
}
