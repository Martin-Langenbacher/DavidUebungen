package com.wcs.java.tx.springboot.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class TransferLogEntry {
	
	public static enum LogLevel {
		DEBUG, INFO, ERROR;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String userFrom;
	
	private String userTo;
	
	private BigDecimal amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserFrom() {
		return userFrom;
	}

	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}

	public String getUserTo() {
		return userTo;
	}

	public void setUserTo(String userTo) {
		this.userTo = userTo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}