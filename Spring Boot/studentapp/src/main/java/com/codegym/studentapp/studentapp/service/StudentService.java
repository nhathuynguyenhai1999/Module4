package com.codegym.studentapp.studentapp.service;

import com.codegym.studentapp.studentapp.model.Student;
import com.codegym.studentapp.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudent(){return studentRepository.getAll();}
    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        Student student =studentRepository.findById(id).get();
        studentRepository.delete(student);
    }
}
