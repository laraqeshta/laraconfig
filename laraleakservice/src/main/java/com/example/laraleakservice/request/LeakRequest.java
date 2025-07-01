/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.laraleakservice.request;

/**
 *
 * @author Admin
 */
public class LeakRequest {
    
    private String description;
    private String status;
    private String reported_by;

    // Default constructor
    public LeakRequest() {
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


    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReportedBy(String reported_by) {
        this.reported_by = reported_by;
    }

}
