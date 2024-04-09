package com.codegym.module4.springproductmanagement.Service;

import com.codegym.module4.springproductmanagement.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private final List<Product> products = new ArrayList<>();
    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        // implementation to get product by id
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; // or throw exception if not found
    }

    @Override
    public void addProduct(Product product) {
        // implementation to add product
        products.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        // implementation to update product
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(product.getId())) {
                products.set(i, product);
                return;
            }
        }
    }

    @Override
    public void deleteProduct(Long id) {
        // implementation to delete product
        products.removeIf(product -> product.getId().equals(id));
    }

    @Override
    public List<Product> searchByNames(String keyword) {
        List<Product> searchResults = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(keyword)) {
                searchResults.add(product);
            }
        }
        return searchResults;
    }

    @Override
    public List<Product> searchByName(String keyword) {
        // implementation to search product by name
        List<Product> searchResults = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(keyword)) {
                searchResults.add(product);
            }
        }
        return searchResults;
    }
}
