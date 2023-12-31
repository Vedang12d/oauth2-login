package com.example.oauth2login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Home Page";
    }

    @GetMapping("secured")
    public String secured() {
        return "Login Completed!";
    }
}
