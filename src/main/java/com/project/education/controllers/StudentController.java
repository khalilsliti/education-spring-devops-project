package com.project.education.controllers;

import com.project.education.entities.Student;
import com.project.education.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping
    public List<Student> getAllStudents() {
        return this.studentService.getAll();
    }

    @GetMapping("/{id}")
    public Optional <Student> getStudentById(Integer id) {
        return this.studentService.getStudentById(id);
    }

}
