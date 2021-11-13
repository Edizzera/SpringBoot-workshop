package com.example.springcourse.repositories;

import com.example.springcourse.entities.Order;
import com.example.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
