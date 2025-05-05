package com.monim.spring_boot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.monim.spring_boot.model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Cannon Camera", 70000));
    public List<Product> getAllProducts() {
        // Logic to fetch all products from the database
        return products;
    }
}
