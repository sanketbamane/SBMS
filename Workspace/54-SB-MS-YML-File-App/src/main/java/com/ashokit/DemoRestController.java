package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.props.AppProperties;

@RestController
public class DemoRestController {

	@Autowired
	private AppProperties appProps;

	@GetMapping("/welcome")
	public String getMsg() {
		System.out.println(appProps.getProperties());
		String welcomeMsg = appProps.getProperties().get("welcomeMsg");
		return welcomeMsg;
	}
}
