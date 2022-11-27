package com.project.education.services;

import com.project.education.entities.University;
import com.project.education.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService implements IUniversityService {
    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public List<University> getAll() {
        return this.universityRepository.findAll();
    }

    @Override
    public void addUniversity(University university) {
        this.universityRepository.save(university);
    }

    @Override
    public void updateUniversity(University university) {
        this.universityRepository.save(university);
    }

    @Override
    public void deleteUniversity(Integer id) {
        this.universityRepository.deleteById(id);
    }

    @Override
    public void getUniversityById(Integer id) {
        this.universityRepository.findById(id);
    }
}
