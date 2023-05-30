package com.example.databaseApp.controller;

import com.example.databaseApp.entity.Product;
import com.example.databaseApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    @PostMapping("/add_product")
    public String add_product(@RequestBody Product product){
        return service.add_product(product);
    }
}
