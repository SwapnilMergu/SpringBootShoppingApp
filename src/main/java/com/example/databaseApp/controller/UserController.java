package com.example.databaseApp.controller;

import com.example.databaseApp.entity.User;
import com.example.databaseApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return  service.login(user);

    }

    @PostMapping("/update")
    public String update(@RequestBody User user){
        return  service.update(user);

    }
    @PostMapping("/delete")
    public String delete(@RequestBody User user){
        return  service.delete(user);

    }

    @PostMapping("/all_users")
    public List<User> all_users(){
        return  service.all_users();

    }

    @GetMapping("/demo")
    public String demo(){
        return  "demo";
    }
}
