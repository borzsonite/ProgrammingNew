package edu.sergeyrozhkov.springdatasecurity.service;

import edu.sergeyrozhkov.springdatasecurity.model.Item;
import edu.sergeyrozhkov.springdatasecurity.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ItemsService {
    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item findById (Long id) {
        return itemRepository.findById(id).get();
    }

}
