package com.bank.auth;

import java.net.URL;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.DbInfo;

public class EnvironmentConfig {
	
	@Bean
	  public Database cloudantclient () {

	    Database db = null;
	    try {
	     /* CloudantClient client = ClientBuilder.url(new URL("https://24b05dfe-8f5a-4c5a-a399-46db4484689d-bluemix:cb7c3709c7936acaf17860376418985e9c9d67a47527bcf87d1fb7b07db3bbde@24b05dfe-8f5a-4c5a-a399-46db4484689d-bluemix.cloudant.com:443"))
	                  .username("24b05dfe-8f5a-4c5a-a399-46db4484689d-bluemix")
	                  .password("cb7c3709c7936acaf17860376418985e9c9d67a47527bcf87d1fb7b07db3bbde")
	                  .build();
	      
	      
	    

	        db = client.database("telco_login", true);*/
	    	CloudantClient client = ClientBuilder.url(new URL("https://eb445a86-9be6-4bf1-8f01-ee9979224019-bluemix:936c5d30632341ec3a060caf327d73effaa4b01fdf289680a94e068f592d9515@eb445a86-9be6-4bf1-8f01-ee9979224019-bluemix.cloudant.com:443"))
	                  .username("eb445a86-9be6-4bf1-8f01-ee9979224019-bluemix")
	                  .password("936c5d30632341ec3a060caf327d73effaa4b01fdf289680a94e068f592d9515")
	                  .build();
	        db = client.database("logindetails", true);
	        
	        System.out.println("DB Connection"+db.info().toString());
	    }catch (Exception e)
	    {
	      e.printStackTrace();
	      
	    }
	  return db;
	}

}

