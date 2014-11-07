package com.business.service;

import java.util.List;

import com.integration.model.Transaction;

public interface TransactionManager {

	public void addTransaction(Transaction transaction);
	
	public List<Transaction> getAllTransactions();
	
}
