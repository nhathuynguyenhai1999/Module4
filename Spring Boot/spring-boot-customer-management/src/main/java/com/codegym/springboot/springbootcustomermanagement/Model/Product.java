package com.codegym.springboot.springbootcustomermanagement.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product-customers")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Productid;
    private String name;
    private String price;
    private String title;
    private String quantity;
    private String description;
}
