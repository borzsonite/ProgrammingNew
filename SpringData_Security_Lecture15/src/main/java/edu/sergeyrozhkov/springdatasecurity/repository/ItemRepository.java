package edu.sergeyrozhkov.springdatasecurity.repository;

import edu.sergeyrozhkov.springdatasecurity.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
