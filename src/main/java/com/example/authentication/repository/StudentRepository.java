package com.example.authentication.repository;

import com.example.authentication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "Select * from student where username = ?1",nativeQuery = true)
    Student findByUsername(String username);
}
