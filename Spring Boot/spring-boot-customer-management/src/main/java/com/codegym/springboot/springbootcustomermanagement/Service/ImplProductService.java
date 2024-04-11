package com.codegym.springboot.springbootcustomermanagement.Service;

import com.codegym.springboot.springbootcustomermanagement.Model.Product;

import java.util.List;

public interface ImplProductService {
    List<Product> getALlProduct();

    Product findProductById(Long id);
    void deleteProduct(Long id);
    void save(Product product);
}
