package com.practice.demo.services;

import com.practice.demo.models.DTOs.NewUserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    public ResponseEntity<?> register(NewUserDto newUserDto);
}
