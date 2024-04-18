package com.codegym.blogapp.model;

import com.codegym.blogapp.dto.res.CategoryResDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Blog> blogs;

    public CategoryResDTO toCategoryResDTO(){
        CategoryResDTO categoryResDTO = new CategoryResDTO();
        categoryResDTO.setId(this.getId());
        categoryResDTO.setName(this.getName());
        return categoryResDTO;
    }
}
