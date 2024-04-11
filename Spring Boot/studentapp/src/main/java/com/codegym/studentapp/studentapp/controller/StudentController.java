package com.codegym.studentapp.studentapp.controller;

import com.codegym.studentapp.studentapp.model.Student;
import com.codegym.studentapp.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public String showStudent(){
        List<Student> studentList = studentService.getAllStudent();
        return "students";
    }
    @PostMapping("/save/student")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect/students";
    }
    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
