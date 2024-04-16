package com.codegym.mysellf.model;
import javax.persistence.*;

@Entity
@Table(name = "shoes")
public class Shoe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shoe_name")
    private String name;

    @Column(name = "brand_name")
    private String brand;

    @Column(name = "price")
    private double price;

    // Constructors, getters, and setters

    public Shoe(Long id, String name, String brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Shoe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

