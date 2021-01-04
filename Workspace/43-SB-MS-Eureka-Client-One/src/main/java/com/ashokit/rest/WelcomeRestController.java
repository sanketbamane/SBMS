package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/wmsg")
	public String welcomeMsg() {
		return "Welcome to Ashok IT...!";
	}

}
