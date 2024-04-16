package com.codegym.mysellf.controller;

import com.codegym.mysellf.model.Shoe;
import com.codegym.mysellf.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/shoes")
public class ShoeController {
    @Autowired
    private ShoeService shoeService;

    @GetMapping("/list")
    public String listShoes(Model model) {
        List<Shoe> shoes = shoeService.findAllShoes();
        model.addAttribute("shoes", shoes);
        return "shoe-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Shoe shoe = new Shoe();
        model.addAttribute("shoe", shoe);
        return "shoe-form";
    }

    @PostMapping("/saveShoe")
    public String saveShoe(@ModelAttribute("shoe") Shoe shoe) {
        shoeService.saveShoe(shoe);
        return "redirect:/shoes/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("shoeId") Long id, Model model) {
        Optional<Shoe> shoe = shoeService.findShoeById(id);
        model.addAttribute("shoe", shoe);
        return "shoe-form";
    }

    @GetMapping("/delete")
    public String deleteShoe(@RequestParam("shoeId") Long id) {
        shoeService.deleteShoe(id);
        return "redirect:/shoes/list";
    }
}
