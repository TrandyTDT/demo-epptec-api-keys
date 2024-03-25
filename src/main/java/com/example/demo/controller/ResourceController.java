package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping("/home")
    public String home() {
        return "We are home";
    }
}
