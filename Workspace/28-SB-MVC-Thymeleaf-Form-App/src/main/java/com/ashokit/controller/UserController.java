package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.binding.User;

@Controller
public class UserController {
	
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user, Model model) {
		return "index";
	}
	
	@PostMapping("/saveUser")
	public String handleSubmitBtn(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		return "data";
	}

}
