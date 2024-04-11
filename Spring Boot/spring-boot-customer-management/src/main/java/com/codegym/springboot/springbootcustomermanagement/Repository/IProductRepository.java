package com.codegym.springboot.springbootcustomermanagement.Repository;

import com.codegym.springboot.springbootcustomermanagement.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
