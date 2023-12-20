package com.practice.demo.services;

import com.practice.demo.models.Role;
import com.practice.demo.repositories.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImplementation implements RoleService{

    private final RoleRepository roleRepository;

    public RoleServiceImplementation(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }
}
