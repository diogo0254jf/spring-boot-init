package com.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.app.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
