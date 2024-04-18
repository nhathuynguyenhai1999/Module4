package com.codegym.blogapp.repository;

import com.codegym.blogapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findCategoriesByNameAndIdNot(String name, Long id);
}
