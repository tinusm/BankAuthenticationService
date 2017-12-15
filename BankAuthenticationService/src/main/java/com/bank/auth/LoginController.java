package com.bank.auth;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;

@RestController
public class LoginController {

	public Database createDB() {
		EnvironmentConfig config = new EnvironmentConfig();
		return config.cloudantclient();
	}

	private static CloudantClient client = null;
	private static Database db = null;

	@CrossOrigin
	@RequestMapping(value ="/authenticate/{username}/{password}", method = RequestMethod.GET)
	public LoginReview checkInfo(@PathVariable("username") String username, @PathVariable("password") String password) {
	System.out.println("Inside Checkout");
		Database db = createDB(); 
		List<LoginReview> requests = db.findByIndex("\"selector\": {\"username\": {\"$eq\":" +username.trim()+ "}}",
				LoginReview.class);
		
		LoginReview returnValue = null;
		System.out.println("checkBusInfo db req " + requests);
		for (LoginReview r : requests) {
			System.out.println("username :" + r.getUsername() + " Password :  " + r.getPassword());
			if(r.getUsername().equals(username) && r.getPassword().equals(password))
			{
				returnValue = r;
				return returnValue;
			}
			else
			{
				return null;
			}
		}
		return null;
		}
}
