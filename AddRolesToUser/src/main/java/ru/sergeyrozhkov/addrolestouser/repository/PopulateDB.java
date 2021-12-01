package ru.sergeyrozhkov.addrolestouser.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.sergeyrozhkov.addrolestouser.models.Role;
import ru.sergeyrozhkov.addrolestouser.models.User;
import ru.sergeyrozhkov.addrolestouser.service.UserService;

import javax.annotation.PostConstruct;


@Component
public class PopulateDB {

    private UserService userService;

    @Autowired
    public PopulateDB(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void populateDB() {
        Role roleAdmin = new Role("ROLE_ADMIN");
        Role roleUser = new Role("ROLE_USER");
        Role roleCustomer = new Role("ROLE_CUSTOMER");

        User admin = new User();
        admin.setEmail("bob@mail.com");
        admin.setPassword("$2a$12$q98.zeMhcdtMh6.EIN/1eO9eJ5RbeU8G1Zl2Bo5zDMUulqYGjH3Pa"); // password is: 100
        admin.setFirstName("Bob");
        admin.setLastName("Johnson");
        admin.getRoles().add(roleAdmin);

        User user = new User();
        user.setEmail("mike@mail.com");
        user.setPassword("$2a$12$q98.zeMhcdtMh6.EIN/1eO9eJ5RbeU8G1Zl2Bo5zDMUulqYGjH3Pa"); // password is: 100
        user.setFirstName("Mike");
        user.setLastName("Petrov");
        user.getRoles().add(roleUser);

        User customer = new User();
        customer.setEmail("ivan@mail.com");
        customer.setPassword("$2a$12$q98.zeMhcdtMh6.EIN/1eO9eJ5RbeU8G1Zl2Bo5zDMUulqYGjH3Pa"); // password is: 100
        customer.setFirstName("Ivan");
        customer.setLastName("Sidorov");
        customer.getRoles().add(roleCustomer);

        userService.save(admin);
        userService.save(user);
        userService.save(customer);
    }
}
