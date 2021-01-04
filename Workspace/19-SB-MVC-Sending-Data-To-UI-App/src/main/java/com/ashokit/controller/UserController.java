package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashokit.domain.User;

@Controller
public class UserController {

	@GetMapping("/user")
	public String getUserData(Model model) {

		User userObj = new User();
		userObj.setUserId(101);
		userObj.setFirstName("Ashok");
		userObj.setLastName("Kumar");
		userObj.setGender("Male");
		userObj.setDob("10-10-2000");

		model.addAttribute("userdata", userObj);

		return "user";
	}

}
