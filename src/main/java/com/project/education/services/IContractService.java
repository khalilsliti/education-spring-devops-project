package com.project.education.services;

import com.project.education.entities.Contract;

import java.util.List;
import java.util.Optional;

public interface IContractService {
    List<Contract> getAll();
    void addContract(Contract contract);
    void updateContract(Contract contract);
    void deleteContract(Integer id);
    Optional<Contract> getContractById(Integer id);

}
