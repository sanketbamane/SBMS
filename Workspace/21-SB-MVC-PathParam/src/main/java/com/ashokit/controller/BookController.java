package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

	@GetMapping(value = "/price/{bname}/{aname}")
	public String getBookPrice(@PathVariable("bname") String bname, 
							   @PathVariable("aname") String aname, Model model) {

		String msgTxt = aname + " " + bname + " Book Price is :: 300 $";

		model.addAttribute("msg", msgTxt);

		return "index";
	}

}
