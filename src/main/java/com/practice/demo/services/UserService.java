package com.practice.demo.services;

import com.practice.demo.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User saveUser(User user);
}
