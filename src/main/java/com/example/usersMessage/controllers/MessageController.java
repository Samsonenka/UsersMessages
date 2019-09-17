package com.example.usersMessage.controllers;

import com.example.usersMessage.models.Message;
import com.example.usersMessage.models.Users;
import com.example.usersMessage.repos.AvatarRepo;
import com.example.usersMessage.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    @Autowired
    private MessageRepo messageRepo;

    @Autowired
    private AvatarRepo avatarRepo;

    @GetMapping("/showMessage")
    public String showMessage(ModelMap modelMap){

        modelMap.put("message", messageRepo.findAll());

        return "message";
    }

    @PostMapping("/addMessage")
    public String addMessage(@AuthenticationPrincipal Users user,
                             @RequestParam String text, ModelMap modelMap){

        Message message = new Message(text, user);
        messageRepo.save(message);

        modelMap.put("message", messageRepo.findAll());

        return "message";
    }
}
