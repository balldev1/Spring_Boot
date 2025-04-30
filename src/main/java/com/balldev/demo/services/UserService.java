package com.balldev.demo.services;

import java.util.List;

import com.balldev.demo.entity.User;

public interface UserService {
    User save(User user); 
    List<User> findAll();
    User findById(Integer id);
}
