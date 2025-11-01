package com.microservice.userService.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.userService.Service.UserService;
import com.microservice.userService.dto.LoginRequest;
import com.microservice.userService.dto.LoginResponse;
import com.microservice.userService.dto.signupRequest;
import com.microservice.userService.dto.userResponse;

@RestController
public class userController {
	
	@Autowired
	UserService userservice;
	
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest login){
		
		System.out.println("login successfull");
		return ResponseEntity.ok(userservice.login(login));
	}
	

}
