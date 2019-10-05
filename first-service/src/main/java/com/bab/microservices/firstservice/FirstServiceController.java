package com.bab.microservices.firstservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bab.microservices.firstservice.bean.GreetingsConfig;

@RestController
public class FirstServiceController {
	
	@Autowired
	private Configuration configuration;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/greetings")
	public GreetingsConfig greetings() {
		return new GreetingsConfig(configuration.getGreetings(), environment.getProperty("local.server.port"));
	}

}
