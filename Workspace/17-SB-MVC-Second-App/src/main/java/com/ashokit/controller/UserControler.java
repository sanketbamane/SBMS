package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserControler {

	@GetMapping("/get-name")
	public String getUserData(Model model) {
		model.addAttribute("msg", "User Name :: Ashok ");
		return "index";
	}

	@GetMapping("/get-email")
	public String getUserEmail(Model model) {
		model.addAttribute("msg", "User Email :: ashokitschool@gmail.com");
		return "index";
	}

	@GetMapping
	public String getUserDob(Model model) {
		model.addAttribute("msg", "User DOB :: 10-Jan-2000");
		return "index";
	}
	
	@PostMapping
	public String getUserCountry(Model model) {
		model.addAttribute("msg", "User Country :: INDIA ");
		return "index";
	}
	
}
