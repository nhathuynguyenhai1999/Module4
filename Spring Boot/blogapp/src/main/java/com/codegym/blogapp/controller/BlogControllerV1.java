package com.codegym.blogapp.controller;

import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogControllerV1 {
    @Autowired
    private BlogService blogService;
    @GetMapping
    public String showBlogs(Model model){
        List<Blog> blogList = blogService.findAllBlogs();
        model.addAttribute("blogs",blogList);
        return "blogs";
    }
    @PostMapping("/save/blog")
    public String save(@ModelAttribute("blog") Blog blog){
        blogService.saveBlog(blog);
        return "save/blogs";
    }
    @GetMapping("/blob/delete/{id}")
    public String remove(@PathVariable("id") Long id, RedirectAttributes redirectAttributes){
        blogService.deleteById(id);
        redirectAttributes.addFlashAttribute("success","Delete blog successfully");
        return "redirect:/blogs";
    }
}
