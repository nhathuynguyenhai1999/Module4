package com.codegym.studentjpa.studentjpa.repository;

import com.codegym.studentjpa.studentjpa.model.Student;

import java.util.List;

public interface IStudentRepository{
    List<Student> findAll();
    Student save(Student student);
    void deleteById(Long id);

}
