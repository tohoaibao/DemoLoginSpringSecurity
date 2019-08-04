package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@GetMapping("/403")	
	public String accessDenied( ) {
		return "403";
	}
}
