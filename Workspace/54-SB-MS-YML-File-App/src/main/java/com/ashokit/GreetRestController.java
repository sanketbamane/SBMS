package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.props.AppProperties;

@RestController
public class GreetRestController {

	@Autowired
	private AppProperties appProps;

	@GetMapping("/greet")
	public String getMsg() {
		String msg = null;

		msg = appProps.getProperties().get("greetMsg");

		return msg;
	}
}
