package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.OncePerRequestFilter;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello")
	@PreAuthorize("isAuthenticated()")
	public String firstPage() {
		return "Hello World";
	}

}
