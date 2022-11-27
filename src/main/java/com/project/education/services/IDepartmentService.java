package com.project.education.services;


import com.project.education.entities.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getAll();

    void addDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(Integer id);

    void getDepartmentById(Integer id);
}
