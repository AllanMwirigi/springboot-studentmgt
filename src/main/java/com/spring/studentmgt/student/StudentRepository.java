package com.spring.studentmgt.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// data access layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // type of data class, id types
    
}
