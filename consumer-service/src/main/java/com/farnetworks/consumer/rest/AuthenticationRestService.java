package com.farnetworks.consumer.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/")
public class AuthenticationRestService {
	
	@PostMapping(path = "/users")
    @HystrixCommand(fallbackMethod = "HelloWorld_Fallback")
	//public LoginResponse login() {
	public String HelloWorld() throws Exception {
		
		//throw new Exception("test");
		return "ok";
	
	}

    @SuppressWarnings("unused")
    private String HelloWorld_Fallback() {
 
        System.out.println("Student Service is down!!! fallback route enabled...");
 
        return "CIRCUIT BREAKER ENABLED!!! No Response From Student Service at this moment. " +
                    " Service will be back shortly - " + new Date();
    }

}
