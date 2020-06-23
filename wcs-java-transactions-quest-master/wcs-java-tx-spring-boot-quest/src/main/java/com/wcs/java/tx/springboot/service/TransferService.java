package com.wcs.java.tx.springboot.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.java.tx.springboot.entities.BankAccount;

@Service
public class TransferService {

	
	public List<BankAccount> transferMoney(String userFrom, String userTo, BigDecimal amount)
			throws InsufficientFundsException {

		throw new IllegalStateException("Not implemented yet");
	}

}
