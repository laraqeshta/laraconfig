/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.laraleakservice.response;

/**
 *
 * @author Admin
 */
public class LeakResponse {
    
    private String description;
    private String status;
    private String reported_by;

    public LeakResponse(String reported_by, String description, String status) {
        this.reported_by = reported_by;
        this.description = description;
        this.status = status;
    }
    // Getters
    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getReportedBy() {
        return reported_by;
    }
}
