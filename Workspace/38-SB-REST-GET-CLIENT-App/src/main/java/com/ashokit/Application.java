package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ashokit.response.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		String endpointUrl = "http://localhost:9090/user";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<User> resEntity = rt.getForEntity(endpointUrl, User.class);

		int statusCodeValue = resEntity.getStatusCodeValue();
		if (statusCodeValue == 200) {
			User body = resEntity.getBody();
			System.out.println(body);
		}

	}

}
