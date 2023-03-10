package com.example.exampleloginwithgithub.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/", "/index"})
    public String index(Model model, @AuthenticationPrincipal OAuth2User user
                        ){
        model.addAttribute("username", user.getName());
        model.addAttribute("title", "Inicio");
        return "index";
    }
}
