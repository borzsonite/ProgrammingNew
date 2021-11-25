package edu.sergeyrozhkov.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping
    public String getHello(Model model, @RequestParam(value ="names", required = false) String name) {
        model.addAttribute("message", name);
        return "hello";
    }

    @GetMapping("/addcat")
    public String cat(Model model) {
    Cat cat = new Cat(1, "Barsik", "white");
    model.addAttribute("cat", cat);
        return "myform";
    }

    @PostMapping("/addcat")
    public String cat(@ModelAttribute Cat cat) {
        System.out.println(cat);
        return "redirect:/";
    }
}
