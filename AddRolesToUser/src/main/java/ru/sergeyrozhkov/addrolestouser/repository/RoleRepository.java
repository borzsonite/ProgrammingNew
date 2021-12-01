package ru.sergeyrozhkov.addrolestouser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergeyrozhkov.addrolestouser.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
