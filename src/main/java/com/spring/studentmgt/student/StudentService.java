package com.spring.studentmgt.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // allows for dependecy injection where this class is used
public class StudentService { // Service layer

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
		// return List.of(
        //     new Student(1L, "John", "john@mail.com", LocalDate.of(2000, Month.JANUARY, 13), 29)
        // );
	}
  
}
