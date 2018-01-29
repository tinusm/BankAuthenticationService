package com.bank.auth;

public class LoginReview {
	public String username;		
	public String password; 
	public String accountId;

	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public LoginReview(){
		
	}
	
	public LoginReview(String username, String password,String accountId) {
		super();
		this.username = username;
		this.password = password;
		this.accountId=accountId;
		
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
