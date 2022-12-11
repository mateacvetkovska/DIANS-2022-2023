package com.example.dians.service;

import com.example.dians.entity.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService {
    List<Bank> getBanksByBankName(String name);
    List<Bank> getBanksByAddress(String address);
    List<Bank> getAllBanks();
    List<Bank> getBanksByCity(String city);

    Optional<Bank> findByNameAndAddress(String name,String address);

    void saveBank(Bank bank);

}
