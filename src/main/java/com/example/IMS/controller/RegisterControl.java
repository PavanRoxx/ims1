package com.example.IMS.controller;

import com.example.IMS.model.User;
import com.example.IMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterControl {

    private final UserService userService;

    @Autowired
    public RegisterControl(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showRegistrationForm(User user) {
        return "register";
    }

    @PostMapping
    public String registerUser(User user) {
        userService.registerUser(user);
        return "redirect:/login";
    }
}
