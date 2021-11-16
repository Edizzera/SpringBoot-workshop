package com.example.springcourse.repositories;

import com.example.springcourse.entities.Category;
import com.example.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
