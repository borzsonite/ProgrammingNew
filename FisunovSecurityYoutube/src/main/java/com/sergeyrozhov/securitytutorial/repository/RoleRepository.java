package com.sergeyrozhov.securitytutorial.repository;

import com.sergeyrozhov.securitytutorial.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
