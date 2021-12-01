package ru.sergeyrozhkov.addrolestouser.service;

import ru.sergeyrozhkov.addrolestouser.models.User;

public interface UserService {
    void save(User user);
    void registerDefaultUser(User user);
}
