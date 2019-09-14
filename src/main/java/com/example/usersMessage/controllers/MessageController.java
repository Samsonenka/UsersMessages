package com.example.usersMessage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    @GetMapping("/showMessage")
    public String showMessage(ModelMap modelMap){

        return "message";
    }
}
