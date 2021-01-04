package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserService serviceBean = context.getBean(UserService.class);

		serviceBean.saveUser(202, "Nick");
		
		System.out.println("#######################################################################3");
		
		serviceBean.getName(101);
	}
}
