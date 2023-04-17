package com.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.app.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
