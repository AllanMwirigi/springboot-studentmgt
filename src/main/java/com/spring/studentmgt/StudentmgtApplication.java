package com.spring.studentmgt;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.spring.studentmgt.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController // makes the class serve rest endpoints
public class StudentmgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmgtApplication.class, args);
	}

	// @GetMapping
	// public String hello() {
	// 	return "Hello World";
	// }
	// @GetMapping
	// public List<Student> hello() {
	// 	return List.of(
    //         new Student(1L, "John", "john@mail.com", LocalDate.of(2000, Month.JANUARY, 13), 26)
    //     );
	// }

}
