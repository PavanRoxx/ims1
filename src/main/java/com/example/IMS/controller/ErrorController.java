package com.example.IMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @GetMapping("/error")
    public String handleError() {
        // Handle error and return a view or redirect to a specific page
        return "login";
    }

    public String getErrorPath() {
        return "/error";
    }
}
