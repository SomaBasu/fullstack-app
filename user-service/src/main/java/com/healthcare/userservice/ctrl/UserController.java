package com.healthcare.userservice.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.userservice.dto.UserDto;
import com.healthcare.userservice.entity.User;
import com.healthcare.userservice.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/test")
	public String getTEst() {
		
		return "UserController getTEst()";
		
	}
	
	@GetMapping("/users")
	public String getUser() {
		
		
		return "user details";
		
	}
	
	
	@PostMapping("/users")
	public User registerUser(@RequestBody UserDto userdto) {
		System.out.println(userdto);
		
		return userService.registerUser(userdto);
	}
	
	@GetMapping("/users/{id}")
	public User viewUser(@PathVariable int id) {
		
		return userService.getUserById(id);
	}

}
