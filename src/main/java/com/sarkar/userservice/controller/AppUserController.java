package com.sarkar.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppUserController {

    @GetMapping("/")
    public String getUserName() {
        return "This is from AppUserController";
    }

}
