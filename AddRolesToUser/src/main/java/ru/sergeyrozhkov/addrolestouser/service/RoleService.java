package ru.sergeyrozhkov.addrolestouser.service;

import ru.sergeyrozhkov.addrolestouser.models.Role;

import java.util.List;

public interface RoleService {
    Role findByName(String name);
    List<Role> listRoles();
}
