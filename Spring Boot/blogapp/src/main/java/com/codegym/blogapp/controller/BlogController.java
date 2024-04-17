package com.codegym.blogapp.controller;

import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.model.Category;
import com.codegym.blogapp.repository.CategoryRepository;
import com.codegym.blogapp.service.BlogService;
import com.codegym.blogapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/category")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    // add category
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping
    public String showCategories(Model model){
        List<Category> categoryList = categoryService.getAllCategories();
        model.addAttribute("categories", categoryList);
        return "categories";
    }
    @PostMapping("/save/category")
    public String save(@ModelAttribute("category") Category category){
        categoryService.saveCategories(category);
        return "save/categories";
    }
    @GetMapping("/category/delete/{id}")
    public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes){
        categoryService.deleteById(id);
        redirectAttributes.addFlashAttribute("success", "delete category done!!!");
        return "redirect:/categories";
    }
}
