package com.example.springSecurity.service;

import com.example.springSecurity.model.Users;
import com.example.springSecurity.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository userRepository;

    public List<Users> getAllUser(){
        return userRepository.findAll();
    }

    public Users saveUser(Users users){
        return userRepository.save(users);
    }
}
