package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.domain.Customer;

@Controller
public class CustomerController {

	@GetMapping("/customer")
	public String loadForm(Model model) {
		Customer customerObj = new Customer();
		model.addAttribute("customer", customerObj);
		return "index";
	}

	@PostMapping("/customer")
	public String handleSubmitBtn(Customer customer, Model model) {
		
		model.addAttribute("customerObj", customer);
		
		return "data";
	}

}
