package com.example.databaseApp.repository;

import com.example.databaseApp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findAllById(Integer id);
}
