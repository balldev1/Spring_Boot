package com.balldev.demo.services;


import com.balldev.demo.entity.User;
import com.balldev.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceAction implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceAction(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user){
        return userRepository.save(user);
    }
}
