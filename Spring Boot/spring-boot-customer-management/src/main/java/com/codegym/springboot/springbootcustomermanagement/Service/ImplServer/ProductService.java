package com.codegym.springboot.springbootcustomermanagement.Service.ImplServer;

import com.codegym.springboot.springbootcustomermanagement.Model.Customer;
import com.codegym.springboot.springbootcustomermanagement.Model.Product;
import com.codegym.springboot.springbootcustomermanagement.Repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final IProductRepository iProductRepository;

    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    public List<Product> getALlProduct() {
        return iProductRepository.findAll();
    }

    public void delete(Long id) {
        iProductRepository.deleteById(id);
    }

    public void save(Product product) {
        iProductRepository.save(product);
    }
}
