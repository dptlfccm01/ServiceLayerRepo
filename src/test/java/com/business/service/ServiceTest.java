package com.business.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.integration.dao.TransactionDao;
import com.integration.model.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ServiceTest {

	@Test
	public void testMainTransactionManager(){
		MainTransactionManager mtm = new MainTransactionManager();
		//--mtm.setTransactionDao(new TransactionDao());
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//MainTransactionManager mtm = (MainTransactionManager) ctx.getBean("mainTransactionManager");
		
		List<Transaction> list = mtm.getAllTransactions();
		for(Iterator<Transaction> it = list.iterator(); it.hasNext();){
			Transaction transaction = it.next();
			System.out.println("OUT> SERVICE: "+transaction.getDescription()+", "+transaction.getTransactionType()+", "+transaction.getValue());
		}
	}

	
	@Test
	public void testAddUser(){
		MainTransactionManager mtm = new MainTransactionManager();
		mtm.setTransactionDao(new TransactionDao());
		Transaction t = new Transaction("SERVICE_DESCRIPTION", 54.22, "INCOME");
		mtm.addTransaction(t);
	}
	
}
