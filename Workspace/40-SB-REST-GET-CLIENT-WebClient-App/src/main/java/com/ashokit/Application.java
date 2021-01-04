package com.ashokit;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashokit.bindings.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		
		String endpointUrl = "http://localhost:9090/greet";
		
		WebClient webClient = WebClient.create();
		
		/*String response =  webClient.get()
				 					.uri(new URI(endpointUrl))
				 					.retrieve()
				 					.bodyToMono(String.class)
				 					.block();
		
		System.out.println("Response :: " + response);*/
		
				/*webClient.get() 
						 .uri(new URI(endpointUrl))
						 .retrieve()
						 .bodyToMono(String.class)
						 .subscribe(Application::handleResponse);
				
		System.out.println("**** After Sending Request ******* ");*/
		
		
		/*String userData = webClient.get()
				 				   .uri(new URI("http://localhost:9090/user"))
				 				   .retrieve()
				 				   .bodyToMono(String.class)
				 				   .block();*/
		
		User userData = webClient.get()
				   .uri(new URI("http://localhost:9090/user"))
				   .retrieve()
				   .bodyToMono(User.class)
				   .block();
		
		System.out.println(userData);
		
	}
	
	public static void handleResponse(String msg) {
		System.out.println("Response :: " + msg);
	}

}
