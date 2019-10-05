package com.bab.microservices.secondservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bab.microservices.secondservice.bean.Greetings;

@RestController
public class SecondServiceController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private FirstServiceProxy proxy;
	
	@GetMapping("/greetings")
	public Greetings greetings() {
		return new Greetings(proxy.greetings().getGreetings(), environment.getProperty("local.server.port"), proxy.greetings().getPort());
	}

}
