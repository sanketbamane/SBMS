package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		//Setting data to display in view
		mav.addObject("msg", "Welcome to Ashok IT...!!");
		
		//Setting Logical View Name
		mav.setViewName("index");
		
		return mav;
	}
}
