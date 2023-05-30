package com.example.databaseApp.repository;

import com.example.databaseApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findAllById(Integer id);
}
