package com.sergeyrozhov.securitytutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/secured")
    public String authorizedPart() {
        return "secured part";
    }
}
