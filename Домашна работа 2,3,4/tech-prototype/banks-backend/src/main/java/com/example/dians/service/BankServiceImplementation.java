package com.example.dians.service;

import com.example.dians.entity.Bank;
import com.example.dians.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImplementation implements BankService{
    @Autowired
    private  BankRepository bankRepository;

    @Override
    public List<Bank> listAllBanks() {
        return bankRepository.findAll();
    }

}
