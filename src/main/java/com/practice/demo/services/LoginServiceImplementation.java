package com.practice.demo.services;

import com.practice.demo.models.DTOs.LoginRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImplementation implements LoginService{
    @Override
    public ResponseEntity<?> login(LoginRequestDTO loginRequestDTO) {
        return null;
    }
}
