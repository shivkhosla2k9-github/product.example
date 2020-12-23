package com.products.demo.product.example.repository;

import com.products.demo.product.example.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
