package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	@GetMapping("/getPrice")
	public String getBookPrice(@RequestParam("book") String bookName, @RequestParam("author") String authorName,
			Model model) {

		String msgTxt = "Price of " + bookName + " Written by " + authorName + " is : 300.00 $";
		
		model.addAttribute("msg", msgTxt);

		return "index";
	}

}
