package com.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
