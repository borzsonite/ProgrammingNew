package ru.sergeyrozhkov.addrolestouser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sergeyrozhkov.addrolestouser.models.User;
import ru.sergeyrozhkov.addrolestouser.service.RoleService;
import ru.sergeyrozhkov.addrolestouser.service.UserService;

@Controller
public class AppController {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public AppController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("users")
    public String listUsers(Model model) {
        model.addAttribute("listUsers", userService.listAll());
        return "/users";
    }

    @GetMapping("users/edit/{id}")
    public String editUser(Model model, @PathVariable(value = "id") Long id) {
        model.addAttribute("user", userService.findById(id));
        model.addAttribute("listRoles", roleService.listRoles());
        return "user_form";
    }

    @PostMapping
    public String processRegister(User user) {
        userService.registerDefaultUser(user);

        return "register_success";
    }

    @PostMapping("/users/save")
    public String saveUser(User user) {
        userService.save(user);

        return "redirect:/users";
    }
}
