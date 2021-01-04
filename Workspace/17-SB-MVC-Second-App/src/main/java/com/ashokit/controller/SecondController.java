package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/second")
public class SecondController {

	@GetMapping(value="/welcome")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Ashok IT...!!");
		mav.setViewName("index");
		return mav;
	}

	@GetMapping("/greet")
	public String displayGreetMsg(Model model) {
		model.addAttribute("msg", "Good Morning..!!");
		return "index";
	}
}
