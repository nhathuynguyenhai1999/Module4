package com.codegym.module4.customermanagementthymeleaf.Controller;
import com.codegym.module4.customermanagementthymeleaf.Model.Customer;
import com.codegym.module4.customermanagementthymeleaf.Service.CustomerService;
import com.codegym.module4.customermanagementthymeleaf.Service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    private final ICustomerService customerService = new CustomerService();
    @GetMapping("")
    public String index(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers",customerList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/update";
    }
    @GetMapping("/{id}/edit")
    public ModelAndView update(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/update");
        modelAndView.addObject("customer", customerService.findById(id));
        return modelAndView;
    }
    @PostMapping("/update")
    public String update(Customer customer) {
        customerService.update(customer.getId(), customer);
        return "redirect:/customers";
    }
    @PostMapping("/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customers";
    }

}
