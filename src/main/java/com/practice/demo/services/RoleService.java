package com.practice.demo.services;

import com.practice.demo.models.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    public Role saveRole(Role role);
}
