package com.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoController {

	@GetMapping("/work")
	@HystrixCommand(fallbackMethod = "m2")
	public String m1() {
		String msg = "Hi, i am from m1() method....!!";
		// logic to access data from cache
		return msg;
	}

	public String m2() {
		String msg = "Hi, i am from fallback method...";
		// logic to access data from db
		return msg;
	}
}
