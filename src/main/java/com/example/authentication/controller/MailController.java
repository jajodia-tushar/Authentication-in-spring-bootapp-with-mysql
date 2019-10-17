package com.example.authentication.controller;


import com.example.authentication.model.Student;
import com.example.authentication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MailController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/user")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/admin/view")
    public String getMe(){
        return "You are in Admin Page";
    }

}
