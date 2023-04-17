package com.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.app.entities.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
