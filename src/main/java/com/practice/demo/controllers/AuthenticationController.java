package com.practice.demo.controllers;

import com.practice.demo.models.DTOs.LoginRequestDTO;
import com.practice.demo.models.DTOs.NewUserDto;
import com.practice.demo.services.AuthenticationService;
import com.practice.demo.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final LoginService loginService;
    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(LoginService loginService, AuthenticationService authenticationService) {
        this.loginService = loginService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register  (
            @RequestBody NewUserDto request
    ){
        return authenticationService.register(request);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO loginRequest){
        return loginService.login(loginRequest);
    }
}
