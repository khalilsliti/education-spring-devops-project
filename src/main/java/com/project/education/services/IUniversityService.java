package com.project.education.services;

import com.project.education.entities.University;

import java.util.List;

public interface IUniversityService {
    List<University> getAll();
    void addUniversity(University university);
    void updateUniversity(University university);
    void deleteUniversity(Integer id);
    void getUniversityById(Integer id);
}
