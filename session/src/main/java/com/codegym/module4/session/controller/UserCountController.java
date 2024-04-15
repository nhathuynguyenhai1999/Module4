package com.codegym.module4.session.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.codegym.module4.session.model.User;
@Controller
@SessionAttributes("counter")
public class UserCountController {
    @ModelAttribute("counter")
    public User setUpCounterUser(){
        return new User();
    }
    @GetMapping
    public String get(@ModelAttribute("counter") User user){
        user.increment();
        return "/index";
    }
}
