package com.example.springcourse.repositories;

import com.example.springcourse.entities.Category;
import com.example.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
