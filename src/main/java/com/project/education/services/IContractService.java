package com.project.education.services;

import com.project.education.entities.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> getAll();
    void addContract(Contract contract);
    void updateContract(Contract contract);
    void deleteContract(Integer id);
    void getContractById(Integer id);

}
