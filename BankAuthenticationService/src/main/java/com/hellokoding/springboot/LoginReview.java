package com.hellokoding.springboot;

public class LoginReview {
	public String username;		
	public String password; 
	public String plan;
	public String packages;
	public String msisdn;
	
	public LoginReview(){
		
	}
	
	public LoginReview(String username, String password, String plan, String packages, String msisdn) {
		super();
		this.username = username;
		this.password = password;
		this.plan = plan;
		this.packages = packages;
		this.msisdn = msisdn;
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

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

}
