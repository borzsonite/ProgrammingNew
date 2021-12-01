package ru.sergeyrozhkov.addrolestouser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sergeyrozhkov.addrolestouser.models.Role;
import ru.sergeyrozhkov.addrolestouser.repository.RoleRepository;

@Service
public class RoleServiceImp implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findByName(String name) {
        return null;
    }
}
