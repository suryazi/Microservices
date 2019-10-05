package com.bab.microservices.secondservice.bean;

public class Greetings {
	
	private String greetings;
	private String reqPort;
	private String port;
	

	public Greetings() {
		super();
	}


	public Greetings(String greetings, String reqPort, String port) {
		super();
		this.greetings = greetings;
		this.reqPort = reqPort;
		this.port = port;
	}


	public String getGreetings() {
		return greetings;
	}


	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}


	public String getReqPort() {
		return reqPort;
	}


	public void setReqPort(String reqPort) {
		this.reqPort = reqPort;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}
	
}
