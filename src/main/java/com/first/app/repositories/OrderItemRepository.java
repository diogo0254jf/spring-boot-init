package com.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.app.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
