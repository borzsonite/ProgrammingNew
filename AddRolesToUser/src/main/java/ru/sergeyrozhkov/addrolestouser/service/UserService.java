package ru.sergeyrozhkov.addrolestouser.service;

import ru.sergeyrozhkov.addrolestouser.models.User;

import java.util.List;

public interface UserService {
    List<User> listAll();
    User findById(Long id);
    void save(User user);
    void registerDefaultUser(User user);
}
