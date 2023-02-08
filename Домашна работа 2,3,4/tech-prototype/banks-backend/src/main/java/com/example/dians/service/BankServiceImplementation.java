package com.example.dians.service;

import com.example.dians.entity.Bank;
import com.example.dians.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImplementation implements BankService{
    private final BankRepository bankRepository;

    @Autowired
    public BankServiceImplementation(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public List<Bank> getBanksByBankName(String name) {
        List<Bank> banks = bankRepository.findAllByName(name);
        return banks;
    }

    @Override
    public List<Bank> getBanksByAddress(String address) {
        List<Bank> banks = bankRepository.findAllByAddress(address);
        return banks;
    }

    @Override
    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    @Override
    public List<Bank> getBanksByCity(String city) {
        List<Bank> banks = bankRepository.findAllByCity(city);
        return banks;
    }

    @Override
    public Optional<Bank> findByNameAndAddress(String name, String address) {
        return bankRepository.findByNameAndAddress(name,address);
    }

    @Override
    public void saveBank(Bank bank) {
        bankRepository.save(bank);
    }


}
