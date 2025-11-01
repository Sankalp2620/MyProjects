package com.microservice.userService.dto;

public class LoginResponse {
	
	private String message;
    private String email;
    
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LoginResponse(String message, String email) {
		super();
		this.message = message;
		this.email = email;
	}
	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "loginResponse [message=" + message + ", email=" + email + "]";
	}

 

}