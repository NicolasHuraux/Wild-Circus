package com.wild_circus.checkpoint.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CircusController {

    @GetMapping("/circus")
    public String browse() {
        return "/circus";
    }
}