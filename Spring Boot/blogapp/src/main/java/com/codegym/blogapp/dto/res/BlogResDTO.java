package com.codegym.blogapp.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlogResDTO {
    private Long id;
    private String title;
    private CategoryResDTO category;
}
