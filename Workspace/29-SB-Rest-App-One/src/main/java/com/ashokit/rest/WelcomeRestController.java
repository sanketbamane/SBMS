package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	public WelcomeRestController() {
		System.out.println("WelcomeRestController::Constructor");
	}

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "Welcome to Ashok IT...!!";
		return msg;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		String msg = "Good Morning...!!";
		return msg;
	}

}
