package com.example.demo.Service;

import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRP userRepository;

    // Method to get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
