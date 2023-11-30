package com.monim.spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String Hello(){
        return "Welcome to Daily Code Buffer";
    }
}
