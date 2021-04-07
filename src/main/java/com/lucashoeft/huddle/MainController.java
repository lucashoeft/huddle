package com.lucashoeft.huddle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String randomString() {
        return "Welcome to huddle!";
    }

}
