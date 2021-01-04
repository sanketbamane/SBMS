package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String displayWelcomeMsg(Model model) {
		
		String welcomeMsg  = "Welcome To Ashok IT...!!";
		
		model.addAttribute("msg", welcomeMsg);
		
		return "index";
	}

}
