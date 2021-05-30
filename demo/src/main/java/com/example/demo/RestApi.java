package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class RestApi {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot and Jib!";
	}

	@RequestMapping(value = "/hostname",method = RequestMethod.GET)
	public String getHostName() throws UnknownHostException {
		return "Welcome to" + InetAddress.getLocalHost().getHostName();
	}
}
