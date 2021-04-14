package com.example.oauthtutorial;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/restricted")
	public String restricted() {
		return "tem q estar logado p ver";
	}
	
}
