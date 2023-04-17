package com.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.app.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
