package com.first.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.app.entities.User;
import com.first.app.repositories.UserRepository;
import com.first.app.services.exeptions.ResourceNotFoundExeption;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundExeption(id));
    }
    

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public void update(Long id, User obj) {
        User entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
        userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
