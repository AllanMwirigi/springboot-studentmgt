package com.spring.studentmgt.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // allows for dependecy injection where this class is used
public class StudentService { // Service layer

  public List<Student> getStudents() {
		return List.of(
            new Student(1L, "John", "john@mail.com", LocalDate.of(2000, Month.JANUARY, 13), 26)
        );
	}
  
}
