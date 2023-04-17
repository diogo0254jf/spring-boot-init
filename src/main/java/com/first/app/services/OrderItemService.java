package com.first.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.app.entities.OrderItem;
import com.first.app.repositories.OrderItemRepository;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository OrderItemRepository;

    public List<OrderItem> findAll() {
        return OrderItemRepository.findAll();
    }

    public OrderItem findById(Long id) {
        Optional<OrderItem> obj = OrderItemRepository.findById(id);
        return obj.get();
    }
    
}
