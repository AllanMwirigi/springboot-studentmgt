package com.spring.studentmgt.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // makes the class serve rest endpoints
@RequestMapping(path = "api/v1/student")
public class StudentController { // API layer 

    private final StudentService studentService;

    @Autowired // dependency injection; the injected class must be annotated 'Component' or 'Service'
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
  
}