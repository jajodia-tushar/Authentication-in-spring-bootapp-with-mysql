package com.example.authentication.service;

import com.example.authentication.model.Student;
import com.example.authentication.model.StudentUserDetails;
import com.example.authentication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StudentUserDetailService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student byUsername = studentRepository.findByUsername(username);
        return new StudentUserDetails(byUsername);
    }
}
