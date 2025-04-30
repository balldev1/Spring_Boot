package com.balldev.demo.controllers;

import com.balldev.demo.entity.User;
import com.balldev.demo.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        user.setId(0);
        return userService.save(user);
    }
    
    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.findAll();
    }
    
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        User  myUser = userService.findById(id);

        if(myUser==null){
            throw new RuntimeException("ไม่พบข้อมูลผู้ใช้รหัส" +id);
        }

        return myUser;
    }
}
