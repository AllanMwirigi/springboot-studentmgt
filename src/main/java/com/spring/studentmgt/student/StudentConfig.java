package com.spring.studentmgt.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    // this code will be run on app startup
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student("John", "john@mail.com", LocalDate.of(2000, Month.JANUARY, 13));
            Student jane = new Student("Jane", "jane@mail.com", LocalDate.of(2002, Month.JANUARY, 13));
            studentRepository.saveAll(List.of(john, jane));
        };
    }

}
