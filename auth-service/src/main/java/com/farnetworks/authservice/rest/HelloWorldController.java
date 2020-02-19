package com.farnetworks.authservice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Authenticated Hello World";
	}
}
