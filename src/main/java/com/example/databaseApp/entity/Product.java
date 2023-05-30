package com.example.databaseApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "product_db")
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String price;
    private Integer category_id;
}
