package com.example.usersMessage.controllers;

import com.example.usersMessage.models.Users;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfilController {

    @GetMapping("/showProfile")
    public String showProfile(@AuthenticationPrincipal Users user, ModelMap modelMap){

        String username = user.getUsername();

        modelMap.put("user", user);

        return "profile";
    }
}
