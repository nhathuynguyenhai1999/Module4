package com.codegym.productcart.service;
import com.codegym.productcart.model.Product;
import java.util.Optional;
public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}
