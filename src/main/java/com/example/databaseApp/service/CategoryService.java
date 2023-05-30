package com.example.databaseApp.service;

import com.example.databaseApp.entity.Category;
import com.example.databaseApp.repository.CategoryRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public String add_category(Category category){
        JSONObject jsonObject= new JSONObject();
        Category added= repository.save(category);
        if (added==null){
            jsonObject.put("status","failed");
            jsonObject.put("message","Data not added successfully");
        }else{
            jsonObject.put("status","success");
        }
        return jsonObject.toJSONString();
    }
}
