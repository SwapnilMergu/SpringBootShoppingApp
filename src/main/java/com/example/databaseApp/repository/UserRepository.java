package com.example.databaseApp.repository;

import com.example.databaseApp.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findAllByEmail(String name);
    User findAllById(Integer id);

     List<User> findAll();
}
