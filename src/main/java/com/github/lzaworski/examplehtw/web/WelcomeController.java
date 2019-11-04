package com.github.sschrder.examplehtw.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("welcome")
    public String welcomeMessage()
    {
        return "hello people";
    }
}
