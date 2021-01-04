package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

	@GetMapping(value = "/work")
	public String doWork(Model model) {
		model.addAttribute("text", "This message coming from demo-controller");
		return "display";
	}

	@GetMapping(value = "/welcome")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Spring Boot....!!");
		return "index";
	}
}
