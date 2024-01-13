package com.example.IMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	 @GetMapping("/")
	    public String login(){
	        return "login";
	    }
	 
	 @GetMapping("/index")
	    public String Index(){
	        return "index";
	    }
}