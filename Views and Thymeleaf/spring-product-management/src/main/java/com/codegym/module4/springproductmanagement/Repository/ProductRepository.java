package com.codegym.module4.springproductmanagement.repository;

import com.codegym.module4.springproductmanagement.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private static final List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,
                "SP1",
                15));
        productList.add(new Product(2,
                "SP2",
                11));
        productList.add(new Product(3,
                "SP3",
                12));
        productList.add(new Product(4,
                "SP4",
                13));
        productList.add(new Product(5,
                "SP5",
                14));
    }

    public void add(Product product) {
        productList.add(product);
    }

    public List<Product> findAll() {
        return productList;
    }

    public Product findById(int id) {
        for (int i = 0; i <= productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return productList.get(i);
            }
        }
        return null;
    }

    public void remove(int id) {
        Product product = findById(id);
        productList.remove(product);
    }
}
