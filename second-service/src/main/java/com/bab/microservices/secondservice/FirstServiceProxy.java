package com.bab.microservices.secondservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bab.microservices.secondservice.bean.Greetings;

@FeignClient(name="first-service")
@RibbonClient(name="first-service")
public interface FirstServiceProxy {
	
	@GetMapping("/greetings")
	public Greetings greetings();

}
