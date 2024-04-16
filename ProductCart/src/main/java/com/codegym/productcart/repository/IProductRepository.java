package com.codegym.productcart.repository;
import com.codegym.productcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface IProductRepository extends JpaRepository<Product,Long> {
}
