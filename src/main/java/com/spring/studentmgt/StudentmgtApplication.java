package com.spring.studentmgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // makes the class serve rest endpoints
public class StudentmgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmgtApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}
	// @GetMapping
	// public List<String> hello() {
	// 	return List.of("Hello", "World");
	// }

}
