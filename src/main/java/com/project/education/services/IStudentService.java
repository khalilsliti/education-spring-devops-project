package com.project.education.services;

import com.project.education.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Integer id);
    void getStudentById(Integer id);
}
