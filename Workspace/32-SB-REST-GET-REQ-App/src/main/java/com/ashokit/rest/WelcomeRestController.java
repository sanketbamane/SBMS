package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcome() {
		String msg = "Welcome to Ashok IT...!!";
		return msg;
	}

	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		String msg = "Good Morning...!!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
