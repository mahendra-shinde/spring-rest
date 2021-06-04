package com.mahendra.controllers;

import javax.xml.ws.Response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloResource {
	
	HttpHeaders headers = new HttpHeaders();
	
	public HelloResource() {
		headers.add("Expires", "0");
		headers.add("Cache-Control", "No-Cache");
		headers.add("author","Mahendra Shinde");
	}
	
	@GetMapping
	public ResponseEntity<String> sayHello() {
		ResponseEntity<String> response = new ResponseEntity<String>("Hello from GET",headers, HttpStatus.OK);
		
		return response;
	}
	
	@PostMapping
	public ResponseEntity<String> sayPost() {
		
		ResponseEntity<String> response = new ResponseEntity<String>("Hello from POST",headers,HttpStatus.OK);
		
		return response;
	}
	
	@PutMapping
	public ResponseEntity<String> sayPut() {
		ResponseEntity<String> response = new ResponseEntity<String>("Hello from PUT",headers, HttpStatus.OK);
		
		return response;
	}
	
	@DeleteMapping
	public ResponseEntity<String> sayDelete() {
		ResponseEntity<String> response = new ResponseEntity<String>("Hello from DELETE",headers ,HttpStatus.OK);
		
		return response;
	}

}
