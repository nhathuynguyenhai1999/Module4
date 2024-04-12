package com.codegym.databinding.form.medicalform.medicalform.controller;

import com.codegym.databinding.form.medicalform.medicalform.model.HealthForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HealthController {
    @GetMapping("/healthForm")
    public String showForm(Model model){
        model.addAttribute("healthForm", new HealthForm());
        return "healthForm";
    }
    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("healthForm") HealthForm healthForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "healthForm";
        }
        // Proccess the healthForm object (save the database, etc.)
        return "confirmationPage";
    }
}
