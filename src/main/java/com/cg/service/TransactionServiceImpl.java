package com.cg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TransactionDao;
import com.cg.model.TransactionDetails;

@Transactional
@Service("transactionService")
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	TransactionDao transDao;

	public int deposit(int accountNo, int amt) {
		// TODO Auto-generated method stub
		return transDao.deposit(accountNo, amt);
	}

	public int withdraw(int accountNo, int amt) {
		// TODO Auto-generated method stub
		return transDao.withdraw(accountNo, amt);
	}

	public int showBalance(int accountNo) {
		// TODO Auto-generated method stub
		return transDao.showBalance(accountNo);
	}

	public TransactionDetails fundTransfer(int accountNo, TransactionDetails transaction) {
		// TODO Auto-generated method stub
		return transDao.fundTransfer(accountNo, transaction);
	}

	public boolean insertTransaction(TransactionDetails transaction) {
		// TODO Auto-generated method stub
		return transDao.insertTransaction(transaction);
	}

}
