package ru.sergeyrozhkov.addrolestouser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sergeyrozhkov.addrolestouser.models.User;
import ru.sergeyrozhkov.addrolestouser.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private UserRepository userRepository;
    private RoleService roleService;

    @Autowired
    public UserServiceImp(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
    }

    public void registerDefaultUser(User user) {
        user.getRoles().add(roleService.findByName("ROLE_USER"));
    }

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
       return userRepository.findById(id).get();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
