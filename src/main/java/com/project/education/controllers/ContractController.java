package com.project.education.controllers;

import com.project.education.entities.Contract;
import com.project.education.services.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contracts")
public class ContractController {
    @Autowired
    private IContractService contractService;

    @GetMapping
    public List<Contract> getAllContracts() {
        return this.contractService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Contract> getContractById(@PathVariable(value = "id") Integer id) {
        return this.contractService.getContractById(id);
    }

    @PostMapping
    public void addContract(@RequestBody Contract contract) {
        this.contractService.addContract(contract);
    }

    @PutMapping
    public void updateContract(@RequestBody Contract contract) {
        this.contractService.updateContract(contract);
    }

    @DeleteMapping("/{id}")
    public void deleteContract(@PathVariable(value = "id") Integer id) {
        this.contractService.deleteContract(id);
    }

}
