package ru.sergeyrozhkov.addrolestouser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sergeyrozhkov.addrolestouser.models.User;
import ru.sergeyrozhkov.addrolestouser.service.UserService;

public class AppController {

    private UserService userService;

    @Autowired
    public AppController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String processRegister(User user) {
        userService.registerDefaultUser(user);

        return "register_success";
    }
}
