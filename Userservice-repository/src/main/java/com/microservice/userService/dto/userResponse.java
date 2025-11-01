package com.microservice.userService.dto;

public class userResponse {
	
	private String id;
	
	private String username;
	
	private String emailId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public userResponse(String id, String username, String emailId) {
		super();
		this.id = id;
		this.username = username;
		this.emailId = emailId;
	}

	public userResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "userResponse [id=" + id + ", username=" + username + ", emailId=" + emailId + "]";
	}
	
	

}
