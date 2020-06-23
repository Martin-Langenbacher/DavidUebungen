package com.wcs.java.tx.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.java.tx.springboot.entities.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount, Long> {

	BankAccount findByUser(String user);

}
