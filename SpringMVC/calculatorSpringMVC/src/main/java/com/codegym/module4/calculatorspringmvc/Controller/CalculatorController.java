package com.codegym.module4.calculatorspringmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController{
    @PostMapping("/calculate")
    public String calculate(int num1, int num2, String operator, Model model){
        int result = 1;
        switch(operator){
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                }
                else {
                    model.addAttribute("error", "Cannot divide by zero");
                    return "index";
                }
                break;
        }
        model.addAttribute("result",result);
        return "index";
    }
}