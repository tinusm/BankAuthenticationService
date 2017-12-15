package com.hellokoding.springboot;

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
	      CloudantClient client = ClientBuilder.url(new URL("https://24b05dfe-8f5a-4c5a-a399-46db4484689d-bluemix:cb7c3709c7936acaf17860376418985e9c9d67a47527bcf87d1fb7b07db3bbde@24b05dfe-8f5a-4c5a-a399-46db4484689d-bluemix.cloudant.com:443"))
	                  .username("24b05dfe-8f5a-4c5a-a399-46db4484689d-bluemix")
	                  .password("cb7c3709c7936acaf17860376418985e9c9d67a47527bcf87d1fb7b07db3bbde")
	                  .build();

	        db = client.database("telco_login", true);
	        System.out.println("DB Connection"+db.info().toString());
	    }catch (Exception e)
	    {
	      e.printStackTrace();
	      
	    }
	  return db;
	}

}

