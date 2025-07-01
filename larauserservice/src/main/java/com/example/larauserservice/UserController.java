/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.larauserservice;

import com.example.larauserservice.model.User;
import com.example.larauserservice.repository.UserRepository;
import com.example.larauserservice.request.UserRequest;
import com.example.larauserservice.response.UserResponse;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
public class UserController {
    
    
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserRequest userRequest) {
        User user = new User(
            userRequest.getName(),
            userRequest.getEmail(),
            userRequest.getPassword(),
            userRequest.getRole()
        );

        userRepository.save(user);
        return ResponseEntity.ok("User created successfully!");
    }
    
    
    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        List<User> users = userRepository.findAll();

        List<UserResponse> response = users.stream()
            .map(user -> new UserResponse(
                user.getName(),
                user.getEmail(),
                user.getRole()
            ))
            .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }
    
    
    
    @GetMapping("/api/users/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id) {
        // Simulate database fetch
        UserResponse user = new UserResponse("John Doe", "john@example.com", "USER");
        return ResponseEntity.ok(user);
    }
}
