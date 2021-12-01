package ru.sergeyrozhkov.addrolestouser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergeyrozhkov.addrolestouser.models.User;
import ru.sergeyrozhkov.addrolestouser.service.UserService;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
