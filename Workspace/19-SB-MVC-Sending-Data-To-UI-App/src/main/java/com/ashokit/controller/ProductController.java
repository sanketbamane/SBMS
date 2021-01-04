package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/product")
	public String getProductData(Model model) {
		
		model.addAttribute("pid", "101");
		model.addAttribute("pname", "Monitor");
		model.addAttribute("price", "10,000 INR");		

		return "product";
	}

}
