package com.codegym.blogapp.restcontroller;

import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")       // GET POST PUT PATCH DELETE
public class BlogAPIController {
    @Autowired
    private BlogService blogService;
    @GetMapping
    public ResponseEntity<?> showBlogs(){
        List<Blog> blogList = blogService.findAllBlogs();
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> saveBlog(@RequestBody  Blog blog){
        Blog blog1 = blogService.saveBlog(blog);

        return new ResponseEntity<>(blog1, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateBlog(@RequestBody Blog blog, @PathVariable Long id){
        Blog blogUpdate = blogService.findById(id);

        blogUpdate.setTitle(blog.getTitle());

        blogService.saveBlog(blogUpdate);
        return new ResponseEntity<>(blogUpdate, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable Long id){
        blogService.deleteById(id);

        return new ResponseEntity<>("XOA THANH CONG", HttpStatus.OK);
    }
}
