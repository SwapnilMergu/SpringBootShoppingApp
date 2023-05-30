package com.example.databaseApp.auth;

import com.example.databaseApp.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AuthenticationResponse {
    public String status;
    public User user;
    public String message;
}
