package com.microservice.userService.Service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.userService.Enitity.UserEntity;
import com.microservice.userService.Repository.UserRespository;
import com.microservice.userService.dto.LoginRequest;
import com.microservice.userService.dto.LoginResponse;
import com.microservice.userService.dto.signupRequest;
import com.microservice.userService.dto.userResponse;

@Service
public class UserService { 
	
	@Autowired
	UserRespository userrepo;

	public userResponse register(signupRequest signup) {
		if(userrepo.existsByEmail(signup.getEmail())) {
		 throw new RuntimeException("Email already exists");		
		}
		UserEntity userentity= new UserEntity();
		userentity.setUsername(signup.getEmail());
		userentity.setEmail(signup.getEmail());
		userentity.setPassword(signup.getPassword());
		
		UserEntity savedusers = userrepo.save(userentity);
		
		userResponse response = new userResponse();
		response.setId(savedusers.getId());
		response.setEmailId(savedusers.getEmail());
		response.setUsername(savedusers.getUsername());
		
		
		return response;
		
	}

	public LoginResponse login(LoginRequest loginreq) {
		UserEntity entity= userrepo.findByEmail(loginreq.getEmail()).orElseThrow(() ->  new RuntimeException("invalid email"));
		 //UserEntity entity= new UserEntity();
		 if( loginreq.getPassword().isBlank() || loginreq.getPassword() == null ) {
			 throw new RuntimeException("password must be filled");
		 }
		 if( !entity.getPassword().equals(loginreq.getPassword()) ) {
			throw new RuntimeException("invalid credentials");
		 }
		 
		return new LoginResponse("Login Successful", entity.getEmail());
	}
	
	


	

}
