package com.example.databaseApp.controller;

import com.example.databaseApp.entity.Category;
import com.example.databaseApp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping("/add_category")
    public String add_category(@RequestBody Category category){
        return service.add_category(category);
    }
    @PostMapping("/demo_category")
    public String demo_c(){
        return "Testing category ";
    }
}
