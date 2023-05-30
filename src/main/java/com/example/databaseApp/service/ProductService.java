package com.example.databaseApp.service;

import com.example.databaseApp.entity.Product;
import com.example.databaseApp.repository.ProductRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public String add_product(Product product){
        JSONObject jsonObject= new JSONObject();
        Product added= repository.save(product);
        if (added==null){
            jsonObject.put("status","failed");
            jsonObject.put("message","Data not added successfully");
        }else{
            jsonObject.put("status","success");
        }
        return jsonObject.toJSONString();
    }
}
