package com.codegym.blogapp.controller;

import com.codegym.blogapp.dto.res.BlogResDTO;
import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.service.ImplBlogService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blogs")
public class BlogController {
    private ImplBlogService blogService;
    @GetMapping
    public String showBlogs(){
        return "blogs";
    }
    @RequestMapping(value = "/update" , method = RequestMethod.POST)
    public ResponseEntity<?> saveBlog(@RequestParam("blogs") String blog){
        // Assuming the blog data is in JSON format, you can parse it and save it to your database
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            // Parse the JSON string into a Blog object
            Blog blog1 = objectMapper.readValue(blog, Blog.class);

            // Save the blog object to the database
            blogService.saveBlogReqDTO(blog1);

            return ResponseEntity.ok("Blog saved successfully");
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving blog");
        }
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> findById(@RequestParam("id") Long id){
        // Assuming you have a service method to find blogs by ID and return them as DTOs
        List<BlogResDTO> blogs = blogService.findBlogById(id);
        if(blogs.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No blogs found for the given ID");
        } else {
            return new ResponseEntity<>(blogs, HttpStatus.OK);
        }
    }
    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBlog(@RequestParam Long id){
        // Assuming you have a service method to delete a blog by ID
        blogService.deleteById(id);
        return new ResponseEntity<>("XOA THANH CONG", HttpStatus.OK);
    }
}
