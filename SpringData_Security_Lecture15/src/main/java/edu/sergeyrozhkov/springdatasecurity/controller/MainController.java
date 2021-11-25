package edu.sergeyrozhkov.springdatasecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String getHello() {
        return "hello";
    }
}
