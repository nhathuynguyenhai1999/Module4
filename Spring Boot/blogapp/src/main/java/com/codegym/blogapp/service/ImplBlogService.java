package com.codegym.blogapp.service;

import com.codegym.blogapp.dto.req.BlogReqDTO;
import com.codegym.blogapp.dto.res.BlogResDTO;
import com.codegym.blogapp.model.Blog;

import java.util.List;

public interface ImplBlogService {

    List<BlogResDTO> findAllBlogs();

    BlogResDTO saveBlogReqDTO(Blog blog);

    BlogResDTO updateBlogReqDTO(BlogReqDTO blogReqDTO);

    List<BlogResDTO> findBlogById(Long id);

    void deleteById(Long id);
}
