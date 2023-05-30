package com.example.databaseApp.service;

import com.example.databaseApp.entity.User;
import com.example.databaseApp.repository.UserRepository;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public String register(User user){
        JSONObject jsonObject= new JSONObject();
        User userRegistered= repository.save(user);
        if(userRegistered!= null){
            jsonObject.put("status","success");
        }
        else {
            jsonObject.put("status","failed");
        }
        return jsonObject.toJSONString();
    }
    public String update(User user){
        JSONObject jsonObject= new JSONObject();
        User existing= repository.findAllById(user.getId());
        if (existing == null) {
            jsonObject.put("status","failed");
            jsonObject.put("message","user does not exists");
        } else {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            existing.setPassword(user.getPassword());
            User userRegistered= repository.save(existing);
            jsonObject.put("status","success");
            jsonObject.put("id",""+existing.getId());
            jsonObject.put("name",existing.getName());
            jsonObject.put("email",existing.getEmail());
            jsonObject.put("password",existing.getPassword());
        }


        return jsonObject.toJSONString();
    }


    public String delete(User user){
        JSONObject jsonObject= new JSONObject();
        if(repository.findAllById(user.getId())==null) {
            jsonObject.put("status","failed");
            jsonObject.put("message","User not found");
        }else{
            repository.delete(user);
            jsonObject.put("status","success");
        }
        return jsonObject.toJSONString();
    }

    public List<User> all_users(){
        List lst= repository.findAll();

        return lst;
    }
    public String login(User user){
        User existing = repository.findAllByEmail(user.getEmail());
        List list= new JSONArray();
//        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject= new JSONObject();
        if (existing != null){
            jsonObject.put("status","success");
            jsonObject.put("id",""+existing.getId());
            jsonObject.put("name",existing.getName());
            jsonObject.put("email",existing.getEmail());
            jsonObject.put("password",existing.getPassword());
        }
        else{
            jsonObject.put("status","failed");
            jsonObject.put("message","User not found please register");
        }
//        jsonArray.add(jsonObject);
        return jsonObject.toJSONString();
    }

}
