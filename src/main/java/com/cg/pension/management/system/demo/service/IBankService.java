package com.cg.pension.management.system.demo.service;

import com.cg.pension.management.system.demo.entities.BankDetails;
import com.cg.pension.management.system.demo.exception.BankAlreadyExistsException;

public interface IBankService {

	public BankDetails addBank(BankDetails bankDetails) throws BankAlreadyExistsException;
	public void deleteBank(Long accno);
}
