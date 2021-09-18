package com.spring.studentmgt.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// data access layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // type of data class, id types
    
    // can specify the exact query to use by annotating the function or just have the function alone
    @Query("SELECT s FROM Student s WHERE s.email = ?1") // JPQL
    Optional<Student> findByEmail(String email);

    // Optional<Student> findByEmail(String email);
}
