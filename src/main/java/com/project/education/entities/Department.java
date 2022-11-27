package com.project.education.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepartment;
    private String departmentName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
    private Set<Student> students;
}
