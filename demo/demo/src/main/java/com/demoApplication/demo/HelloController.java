package com.demoApplication.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
		//GET Call --> /hello -> Hello world with 
	@GetMapping("/welcome")
	public ResponseEntity HelloWorld() {
			String hello = "Hello Sai This is the first api call!";
			Person p=new Person(1,"sai","TPG");
			return ResponseEntity.ok(p);
	}
	
}
