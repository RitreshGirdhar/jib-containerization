package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot and Jib!";
	}
}
