package com.microservice.userService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.userService.Service.UserService;
import com.microservice.userService.dto.signupRequest;
import com.microservice.userService.dto.userResponse;


@RestController
public class SignupController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/signup")
	public ResponseEntity<userResponse> registerUser(@RequestBody signupRequest signupreq){
		System.out.println("sign up successfull");
		return ResponseEntity.ok(userservice.register(signupreq));
	}

}
