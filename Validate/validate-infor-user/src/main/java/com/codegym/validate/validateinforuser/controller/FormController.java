package com.codegym.validate.validateinforuser.controller;

import com.codegym.validate.validateinforuser.model.SignUp;
import com.codegym.validate.validateinforuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    private UserService userService;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("signup", new SignUp());
        return "login";
    }

    public String submitForm(@Valid @ModelAttribute ("signup") SignUp signUp , BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "login";
        }
        userService.saveUser(signUp);
        return "success";
    }
}
