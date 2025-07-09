package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        return "Welcome "+name+" to Jenkins";
    }

}
