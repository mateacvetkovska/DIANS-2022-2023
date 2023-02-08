package com.example.dians.web;

import com.example.dians.entity.Bank;
import com.example.dians.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/banks")
@Validated
@CrossOrigin(origins="*")
public class BankController {
    @Autowired
    private final BankRepository bankRepository;

    public BankController(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @GetMapping()
    public List<Bank> getBanksHomePage(){
        return bankRepository.findAll();
    }


}
