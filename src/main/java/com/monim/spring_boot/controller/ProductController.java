package com.monim.spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monim.spring_boot.model.Product;
import com.monim.spring_boot.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}