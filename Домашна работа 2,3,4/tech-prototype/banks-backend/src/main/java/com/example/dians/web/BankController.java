package com.example.dians.web;

import com.example.dians.entity.Bank;
import com.example.dians.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/banks")
@Validated
@CrossOrigin(origins="*")
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping()
    public List<Bank> getAllBanks(){
        return this.bankService.listAllBanks();
    }

}
