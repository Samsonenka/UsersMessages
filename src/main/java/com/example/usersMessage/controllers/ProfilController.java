package com.example.usersMessage.controllers;

import com.example.usersMessage.models.Avatar;
import com.example.usersMessage.models.Users;
import com.example.usersMessage.repos.AvatarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfilController {

    @Autowired
    private AvatarRepo avatarRepo;

    @GetMapping("/showProfile")
    public String showProfile(@AuthenticationPrincipal Users user, ModelMap modelMap){

        modelMap.put("username", user.getUsername());

        return "profile";
    }

    @GetMapping("/avatarCreateForm")
    public String avatarCreateForm(){
        return "avatarCreateForm";
    }

    @PostMapping("/avatarCreate")
    public String avatarCreate(@AuthenticationPrincipal Users user,
                               @RequestParam String urlAvatar, ModelMap modelMap){


        return "profile";
    }
}
