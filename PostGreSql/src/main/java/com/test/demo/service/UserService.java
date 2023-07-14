package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.User;
import com.test.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Iterable<User> getAllProduct() {
        return repository.findAll();
    }

    public User addUser(User user) {
        return repository.save(user);
    }

    public User getUser(long id) {
        User user = repository.findById(id).orElse(null);
        return user;
    }

    public User deleteProduct(long id) {
        User deleteUser = repository.findById(id).orElse(null);
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
        return deleteUser;
    }
 
}
