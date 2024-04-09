package com.codegym.module4.springproductmanagement.Controller;

import com.codegym.module4.springproductmanagement.Model.Product;
import com.codegym.module4.springproductmanagement.Service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private final IProductService productService;
    private final List<Product> products = new ArrayList<>();
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String showProductList(Model model) {
        // implementation to show product list
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @GetMapping("/add")
    public String showAddProductForm(Model model) {
        // implementation to show add product form
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/add")
    public String addProduct(Product product) {
        // implementation to add product
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String showUpdateProductForm(@RequestParam Long id, Model model) {
        // implementation to show update product form
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "update-product";
    }

    @PostMapping("/update")
    public String updateProduct(Product product) {
        // implementation to update product
        productService.updateProduct(product);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam Long id) {
        // implementation to delete product
        products.removeIf(product -> product.getId().equals(id));
        productService.deleteProduct(id);
        return "redirect:/";
    }

    @GetMapping("/detail")
    public String showProductDetail(@RequestParam Long id, Model model) {
        // implementation to show product detail
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product-detail";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam String keyword, Model model) {
        // implementation to search product by name
        model.addAttribute("products", productService.searchByName(keyword));
        return "search-result";
    }
}
