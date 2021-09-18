package com.spring.studentmgt.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

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

    public void addNewStudent(Student student) {
        Optional<Student> s = studentRepository.findByEmail(student.getEmail());
        if (s.isPresent()) {
            throw new IllegalStateException("Email taken"); 
            // adding "server.error.include-message=always" to application.properties ensures that the error msg is sent to the client
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new IllegalStateException("Student with id " + id + " does not exist");
        }
        studentRepository.deleteById(id);
    }

    @Transactional // with this, no need to define the query, can use setter to update
    public void updateStudent(Long id, String name, String email) {
        Student student = studentRepository.findById(id)
        .orElseThrow( () -> new IllegalStateException("Student with id " + id + " does not exist"));
        
        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }
        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> s = studentRepository.findByEmail(email);
            if (s.isPresent()) {
                throw new IllegalStateException("Email taken"); 
            }
            student.setEmail(email);
        }
    }
  
}
