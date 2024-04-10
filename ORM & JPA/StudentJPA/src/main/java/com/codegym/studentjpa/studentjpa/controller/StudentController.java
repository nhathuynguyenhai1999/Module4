package com.codegym.studentjpa.studentjpa.controller;

import com.codegym.studentjpa.studentjpa.model.Student;
import com.codegym.studentjpa.studentjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "home";
    }
//
//    @PostMapping("/students")
//    public String saveStudent(@ModelAttribute("student") Student student) {
//        studentService.saveStudent(student);
//        return "redirect:/students";
//    }
//
//    @GetMapping("/students/delete/{id}")
//    public String deleteStudent(@PathVariable("id") Long id) {
//        studentService.deleteStudent(id);
//        return "redirect:/students";
//    }
}

