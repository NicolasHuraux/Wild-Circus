package com.wild_circus.checkpoint.controllers;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HerosController {

    @GetMapping("/browse")
    public String browse() {
        return "/browse";
    }

}