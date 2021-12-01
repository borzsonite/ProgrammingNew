package ru.sergeyrozhkov.addrolestouser.service;

import ru.sergeyrozhkov.addrolestouser.models.Role;

public interface RoleService {
    Role findByName(String name);
}
