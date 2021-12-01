package edu.sergeyrozhkov.springdatasecurity.controller;

import edu.sergeyrozhkov.springdatasecurity.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("items")
public class ItemsController {

    private ItemsService itemsService;

    @Autowired
    public void setItemsService(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public String getItems(Model model) {
        model.addAttribute("items", itemsService.getAllItems());
        return "items";
    }

    @GetMapping("/getItem/{id}")
    public String getAll(Model model, @PathVariable Long id) {
        model.addAttribute("item", itemsService.findById(id));
        return "item";
    }
}
