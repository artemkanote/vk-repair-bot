package com.repairbot.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Request {
    private String userId;
    private String userName;
    private String phoneNumber;
    private String description;
    private LocalDateTime createdAt;

    public Request(String userId, String userName, String phoneNumber, String description) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }

    public String format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("Request from: %s (ID: %s)\nPhone: %s\nDescription: %s\nCreated At: %s", 
            userName, userId, phoneNumber, description, createdAt.format(formatter));
    }

    // Getters and setters can be added here if needed
}