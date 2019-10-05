package com.bab.microservices.firstservice.bean;

public class GreetingsConfig {
	
	private String greetings;
	private String port;
	

	public GreetingsConfig() {
		super();
	}
	

	public GreetingsConfig(String greetings, String port) {
		super();
		this.greetings = greetings;
		this.port = port;
	}


	public String getGreetings() {
		return greetings;
	}


	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}

	
}
