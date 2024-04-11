package com.codegym.studentapp.studentapp.repository;

import com.codegym.studentapp.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> getAll();
}
