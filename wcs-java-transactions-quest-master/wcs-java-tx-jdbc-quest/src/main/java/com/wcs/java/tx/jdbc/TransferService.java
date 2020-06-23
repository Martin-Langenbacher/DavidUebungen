package com.wcs.java.tx.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

public class TransferService {
	
	// so hole ich die Möglichkeiten von AccountService in TransferService !!!!!!!!!!!!!!!!!!!!!!!
	
	// könnte man auch instanz-Variable, 
	private AccountService accountService;
	private Connection con;
	
	// Constructor anlegen, der den AccountService anlegt & zusätzlich die Connection mit übergeben...
	public TransferService(AccountService accountService, Connection con) {
		super();
		this.accountService = accountService;
		this.con = con;
	}
	
	

	public void transferMoney(String userFrom, String userTo, BigDecimal amount)
			throws SQLException, InsufficientFundsException {
			
		try {
			// ausgeblendet klappt es nicht: Zeile 29, 32, 35
			con.setAutoCommit(false);
			// Reihenfolge spielt eine Rolle, da er sonst vorher abbricht und in den catch-Block springt.
			accountService.deposit(userTo, amount);
			accountService.withdraw(userFrom, amount);
			con.commit(); 
	
			} catch(InsufficientFundsException ex) {
				con.rollback();
				throw ex;
			}
	}
}
