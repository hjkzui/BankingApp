package com.practice.demo.services;

import com.practice.demo.models.DTOs.LoginRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public ResponseEntity<?> login(LoginRequestDTO loginRequestDTO);
}
