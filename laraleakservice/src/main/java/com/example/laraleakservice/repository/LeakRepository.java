/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.laraleakservice.repository;

/**
 *
 * @author Admin
 */
import com.example.laraleakservice.model.Leak;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeakRepository extends JpaRepository<Leak, Long> {
    // You can add custom queries here later if needed
}
