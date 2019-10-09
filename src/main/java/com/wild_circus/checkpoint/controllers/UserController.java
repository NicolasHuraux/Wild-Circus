package com.wild_circus.checkpoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/login")
    public String login() {
        return "/login";
    }
    
    @GetMapping("/loginError")
    public String loginError() {
        return "/loginError";
    }

}