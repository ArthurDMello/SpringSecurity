package com.example.springSecurity.controller;

import com.example.springSecurity.model.Users;
import com.example.springSecurity.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UsersService userService;

    @GetMapping("/get")
    public List<Users> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping("/post")
    public Users saveUser(Users users) {
        return userService.saveUser(users);
    }
}
