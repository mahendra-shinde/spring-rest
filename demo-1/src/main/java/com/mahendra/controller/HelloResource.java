package com.mahendra.controller;


//Controller MUST BE in same package or sub-package of Application Class
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
/// http://localhost:8080/api/hello
public class HelloResource {

	@GetMapping
	public String sayHello() {
		return "Hello World";
	}
}
