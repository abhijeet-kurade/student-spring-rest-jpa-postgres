package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student abhijeet = new Student(
                    "Abhijeet",
                    "abk@microsoft.com",
                    LocalDate.of(1995, 11, 18)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@microsoft.com",
                    LocalDate.of(2000, 11, 18)
            );
            repository.saveAll(
                    List.of(abhijeet, alex)
            );
        };
    }
}
