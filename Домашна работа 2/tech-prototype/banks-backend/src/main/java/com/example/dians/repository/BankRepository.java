package com.example.dians.repository;

import com.example.dians.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
    List<Bank> findAllByName(String name);
    List<Bank> findAllByAddress(String address);
    List<Bank> findAllByCity(String city);
    Optional<Bank> findByNameAndAddress(String name,String address);
}
