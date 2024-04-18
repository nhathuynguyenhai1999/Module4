package com.codegym.blogapp.service;

import com.codegym.blogapp.dto.res.BlogResDTO;
import com.codegym.blogapp.model.Category;
import com.codegym.blogapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public void saveCategories(Category category){
        categoryRepository.save(category);
    }

    public void deleteById(Long id){
        Category category = categoryRepository.findById(id).get();
        categoryRepository.delete(category);
    }
}
