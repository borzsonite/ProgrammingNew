package com.sergeyrozhov.securitytutorial.repository;

import com.sergeyrozhov.securitytutorial.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String name);
}
