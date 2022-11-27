package com.project.education.repositories;

import com.project.education.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,Integer> {
}
