package com.ashokit.rest;

import java.net.URI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashokit.request.Book;

@RestController
public class TestRestController {

	
	@GetMapping("/test")
	public String test() throws Exception{
		
		Book b = new Book();
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(450.00);
		
		String endpointUrl = "http://localhost:9090/addbook";
		
		WebClient webClient = WebClient.create();
		 	String response = webClient.post()
							  		   .uri(new URI(endpointUrl))
							  		   .bodyValue(b)
							  		   .retrieve()
							  		   .bodyToMono(String.class)
							  		   .block();
		 	
		 	System.out.println("Response :: "+response);
							  
		 	
		 	return response;
	}
}
