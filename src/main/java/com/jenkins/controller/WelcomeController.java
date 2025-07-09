package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome/{name}")
    public String welcome(String name) {
        return "Welcome "+name+" to Jenkins";
    }

}
