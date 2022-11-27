package com.project.education.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudent;
    private String lastName;
    private String firtName;
    @Enumerated(EnumType.STRING)
    private Field field;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
    private Set<Contract> contracts;
    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;
    @ManyToMany(mappedBy = "students",cascade = CascadeType.ALL)
    private Set<Team> teams;


}
