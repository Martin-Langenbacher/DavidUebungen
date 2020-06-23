package com.wcs.java.tx.jpa.simple;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TransferService {

	

	public List<BankAccount> transferMoney(String userFrom, String userTo, BigDecimal amount)
			throws InsufficientFundsException {

		throw new IllegalStateException("Not implemented");
	}
	

}
