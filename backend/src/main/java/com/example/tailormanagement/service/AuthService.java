package com.example.tailormanagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tailormanagement.dto.LoginRequest;
import com.example.tailormanagement.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public boolean login(LoginRequest request) {

        return userRepository
                .findByUsernameAndPasswordAndRole(
                        request.getUsername(),
                        request.getPassword(),
                        request.getRole())
                .isPresent();
    }
}
