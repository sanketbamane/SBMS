package com.ashokit.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.User;
import com.ashokit.binding.Users;

@RestController
public class UserRestController {

	@GetMapping(
				value = "/user",
				produces = { 
						"application/xml", 
						"application/json"
				}
	)
	public ResponseEntity<User> getUser() {
		User user = new User();
		user.setUserId(101);
		user.setUsername("Ashok");
		user.setUserEmail("ashokitschool@gmail.com");
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@GetMapping(
			value = "/users",
			produces = { 
					"application/xml", 
					"application/json"
			}
	)
	public ResponseEntity<Users> getUsers() {
		User user1 = new User();
		user1.setUserId(101);
		user1.setUsername("Ashok");
		user1.setUserEmail("ashokitschool@gmail.com");
		
		User user2 = new User();
		user2.setUserId(102);
		user2.setUsername("Chakravarthy");
		user2.setUserEmail("ashokit4you@gmail.com");
		
		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		
		Users users = new Users();
		users.setUser(list);
		
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
}