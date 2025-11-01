package com.microservice.userService.dto;

public class LoginRequest {
	
	private String Email;
	
	private String password;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequest(String email, String password) {
		super();
		Email = email;
		this.password = password;
	}

	public LoginRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginRequest [Email=" + Email + ", password=" + password + "]";
	}


	

}
