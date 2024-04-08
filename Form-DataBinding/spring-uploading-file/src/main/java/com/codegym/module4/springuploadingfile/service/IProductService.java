package com.codegym.module4.springuploadingfile.service;
import com.codegym.module4.springuploadingfile.model.Product;
import java.util.List;
public interface IProductService {
    List<Product> findAll();
    void save (Product product);
    Product findById(int id);
    void update(int id,Product product);
    void remove(int id);
}
