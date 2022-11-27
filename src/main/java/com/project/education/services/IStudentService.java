package com.project.education.services;

import com.project.education.entities.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> getAll();
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Integer id);
    Optional<Student> getStudentById(Integer id);
}
