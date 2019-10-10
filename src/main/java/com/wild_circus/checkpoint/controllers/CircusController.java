package com.wild_circus.checkpoint.controllers;

import java.util.List;

import com.wild_circus.checkpoint.entities.Circus;
import com.wild_circus.checkpoint.repositories.CircusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CircusController {

    // @GetMapping("/circus")
    // public String browse() {
    //     return "circus";
    // }

    @Autowired
    private CircusRepository circusRepo;
    
    @GetMapping("/circus")
    public String browse(Model model) {
        List<Circus> circus = circusRepo.findAll();
        model.addAttribute("circus", circus);
        return "/circus";
    }
}