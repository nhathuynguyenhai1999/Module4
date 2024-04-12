package com.codegym.blogapp.service;

import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;


    public List<Blog> findAllBlogs(){
        return blogRepository.findAll();
    }

    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }
    public void deleteById(Long id){
        Blog blog = blogRepository.findById(id).get();
        blogRepository.delete(blog);
    }
}
