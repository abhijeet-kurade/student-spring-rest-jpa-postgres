package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping
    public int getTestController(){
        return 10;
    }

    @PostMapping
    public List<String> postTestController(){
        return Arrays.asList("Abhijeet", "Kurade");
    }
}
