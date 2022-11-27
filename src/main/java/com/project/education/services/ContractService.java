package com.project.education.services;

import com.project.education.entities.Contract;
import com.project.education.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ContractService implements IContractService {
    @Autowired
    // Autowiring relationships between collaborating beans (aka Dependency Injection )
    private ContractRepository contractRepository;


    @Override
    public List<Contract> getAll() {
        return this.contractRepository.findAll();
    }

    @Override
    public void addContract(Contract contract) {
        this.contractRepository.save(contract);
    }

    @Override
    public void updateContract(Contract contract) {
        this.contractRepository.save(contract);

    }

    @Override
    public void deleteContract(Integer id) {
        this.contractRepository.deleteById(id);
    }

    @Override
    public Optional<Contract> getContractById(Integer id) {
        return this.contractRepository.findById(id);

    }
}
