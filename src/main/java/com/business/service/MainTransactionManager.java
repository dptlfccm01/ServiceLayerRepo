package com.business.service;

import java.util.ArrayList;
import java.util.List;

import com.integration.model.Transaction;
import com.integration.dao.TransactionDao;

public class MainTransactionManager implements TransactionManager{

	private TransactionDao transactionDao;
	
	public MainTransactionManager(){
		
		//only temporary, but we should not have this:
		transactionDao = new TransactionDao();
		
	}
	
	public List<Transaction> getAllTransactions() {
		return transactionDao.getAllTransactions();
	}

	public void addTransaction(Transaction transaction) {
		transactionDao.addTransaction(transaction);
	}
	
	public TransactionDao getTransactionDao(){
		return transactionDao;
	}
	
	public void setTransactionDao(TransactionDao transactionDao){
		this.transactionDao = transactionDao;
	}

	
}
