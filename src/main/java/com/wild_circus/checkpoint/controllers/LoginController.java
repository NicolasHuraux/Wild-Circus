package com.wild_circus.checkpoint.controllers;

import javax.validation.Valid;

import com.wild_circus.checkpoint.entities.User;
import com.wild_circus.checkpoint.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "/login";
    }

    @GetMapping("/home")
    public String home() {
        return "circus";        //avec ce get je passe outre l obligaiton de se logger(a regler en reinstallant spring security?)
    }
    
    @GetMapping("/loginError")
    public String loginError() {
        return "/loginError";
    }

       
    @PostMapping("/users/create")
    public String store(@Valid User user) {
        user = userRepository.save(user);
        return "redirect:/circus";         //envoie vers la page circus apres inscription
    }
}