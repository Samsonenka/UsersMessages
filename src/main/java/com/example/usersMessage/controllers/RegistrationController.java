package com.example.usersMessage.controllers;

import com.example.usersMessage.models.Role;
import com.example.usersMessage.models.Users;
import com.example.usersMessage.repos.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class RegistrationController {

    @Autowired
    private UsersRepo usersRepo;

    @GetMapping("/registration")
    public String showRegistration(){

        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(Users user, ModelMap modelMap){

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        usersRepo.save(user);

        return "login";
    }
}
