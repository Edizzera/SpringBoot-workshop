package com.example.springcourse.repositories;

import com.example.springcourse.entities.OrderItem;
import com.example.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
