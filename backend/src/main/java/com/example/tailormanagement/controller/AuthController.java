package com.example.tailormanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.tailormanagement.dto.LoginRequest;
import com.example.tailormanagement.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestBody LoginRequest request) {

        if(authService.login(request)) {
            return ResponseEntity.ok("Login Successful");
        }

        return ResponseEntity
                .badRequest()
                .body("Invalid Username or Password");
    }
}
