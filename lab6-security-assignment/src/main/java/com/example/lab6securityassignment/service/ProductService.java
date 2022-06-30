package com.example.lab6securityassignment.service;


import com.example.lab6securityassignment.entity.Product;


import java.util.List;

public interface ProductService {

    void save(Product p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();
}
