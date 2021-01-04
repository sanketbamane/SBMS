package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String displayWelcomeMsg(@RequestParam("name") String s, Model model) {
		
		String msgText = s.concat(", Welcome to Ashok IT...!!");
		
		model.addAttribute("msg", msgText);

		return "index";
	}

}
