package com.codegym.blogapp.model;

import com.codegym.blogapp.dto.res.BlogResDTO;
import com.codegym.blogapp.dto.res.CategoryResDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "blogs")
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public BlogResDTO toBlogResDTO(){
        BlogResDTO blogResDTO = new BlogResDTO();
        blogResDTO.setId(this.getId());
        blogResDTO.setTitle(this.getTitle());
        blogResDTO.setCategory(this.category.toCategoryResDTO());
        return blogResDTO;
    }
}
