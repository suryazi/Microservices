package com.bab.microservices.firstservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("first-service")
public class Configuration {
	
	private String greetings;

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	

}
