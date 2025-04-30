package com.balldev.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.balldev.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> data = new ArrayList<>();
        data.add(new User("ball", "dev"));
        data.add(new User("jojo", "dev"));
        return data;
    }
    
}
