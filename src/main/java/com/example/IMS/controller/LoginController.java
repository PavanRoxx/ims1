package com.example.IMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.IMS.model.User;
import com.example.IMS.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private final UserService userService;


	
	public LoginController(UserService userService) {
		this.userService = userService;
	}

	/*
	 * @GetMapping public String showLoginForm() { return "login"; }
	 */
	
	@PostMapping("/authenticate")
	public String authenticateUser(@RequestParam String email, @RequestParam String password, RedirectAttributes attributes) {
		// Implement logic to authenticate the user
		User authenticatedUser = userService.authenticateUser(email, password);
		if (authenticatedUser != null) {
			// Add user information to the session if needed
			attributes.addFlashAttribute("user", authenticatedUser);
			// Redirect to the index page upon successful login
			return "redirect:/index";
		} else {
			// Redirect back to the login page with an error message
			return "redirect:/login?error=authentication";
		}
	}

}