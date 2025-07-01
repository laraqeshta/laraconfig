/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.laraleakservice;

import com.example.laraleakservice.forign.UserClient;
import com.example.laraleakservice.forign.UserResponse;
import com.example.laraleakservice.model.Leak;
import com.example.laraleakservice.repository.LeakRepository;
import com.example.laraleakservice.request.LeakRequest;
import com.example.laraleakservice.response.LeakResponse;
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
public class LeakController {
    
    @Autowired
    private LeakRepository leakRepository;

    @PostMapping
    public ResponseEntity<String> createLeak(@RequestBody LeakRequest leakRequest) {
        Leak leak = new Leak(
            leakRequest.getReportedBy(),
            leakRequest.getDescription(),
            leakRequest.getStatus()
        );

        leakRepository.save(leak);
        return ResponseEntity.ok("Leak created successfully!");
    }
    
    
    @GetMapping
    public ResponseEntity<List<LeakResponse>> getAllUsers() {
        List<Leak> leaks = leakRepository.findAll();

        List<LeakResponse> response = leaks.stream()
            .map(leak -> new LeakResponse(
                leak.getReportedBy(),
                leak.getDescription(),
                leak.getStatus()
            ))
            .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }
    
    
    
    private final UserClient userClient;

    public LeakController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/test-user/{id}")
    public ResponseEntity<UserResponse> fetchUser(@PathVariable Long id) {
        UserResponse user = userClient.getUserById(id);
        return ResponseEntity.ok(user);
    }
}
