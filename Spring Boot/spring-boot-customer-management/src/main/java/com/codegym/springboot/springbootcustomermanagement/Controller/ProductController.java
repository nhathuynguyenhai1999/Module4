package com.codegym.springboot.springbootcustomermanagement.Controller;

import com.codegym.springboot.springbootcustomermanagement.Model.Product;
import com.codegym.springboot.springbootcustomermanagement.Service.ImplProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping
public class ProductController {
    private final ImplProductService implProductService;
    @Autowired
    public ProductController(ImplProductService implProductService) {
        this.implProductService = implProductService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> home(Model model){
        List<Product> products = implProductService.getALlProduct();
        model.addAttribute("product", products);
        return products;
    }

    @RequestMapping(value = "/products/id" , method = RequestMethod.GET)
    public Product findIdProduct(@RequestParam Long id){
        return implProductService.findProductById(id);
    }

    @DeleteMapping(value = "/remove")
    public boolean deleteIdProduct(@RequestParam Long id){
        try {
            implProductService.deleteProduct(id);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
