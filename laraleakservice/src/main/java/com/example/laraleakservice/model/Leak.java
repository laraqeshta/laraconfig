/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.laraleakservice.model;


import jakarta.persistence.*;

@Entity
@Table(name = "leaks") // matches your table name in MySQL
public class Leak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reported_by;

    private String description;

    private String status;

    // Constructors
    public Leak() {}

    public Leak(String reported_by, String description, String status) {
        this.status = status;
        this.description = description;
        this.reported_by = reported_by;
    }
    public String getReportedBy() {
        return reported_by;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
    // Getters and Setters
    // (or use Lombok @Data if you prefer)
}
