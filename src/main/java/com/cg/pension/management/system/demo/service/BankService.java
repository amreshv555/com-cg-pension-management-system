package com.cg.pension.management.system.demo.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pension.management.system.demo.entities.BankDetails;
import com.cg.pension.management.system.demo.entities.Pensioner;
import com.cg.pension.management.system.demo.exception.BankAlreadyExistsException;
import com.cg.pension.management.system.demo.repository.IBankRepository;

@Service
public class BankService implements IBankService{
	
	private static final Logger LOG = LoggerFactory.getLogger(PensionerService.class);
	
	@Autowired
	private IBankRepository bankRepository;
	
	@Autowired
	private BankDetails bankDetails;

	@Override
	public BankDetails addBank(BankDetails bankDetails) throws BankAlreadyExistsException  {
		LOG.info("addBankDetails");
		if(!bankRepository) {
			LOG.info("Bank Details added successfully");
			return bankRepository.save(bankDetails);
		}else {
		throw new BankAlreadyExistsException("Bank Details already provided");
	}
		}

	@Override
	public void deleteBank(int accno) {
		if(bankRepository.exists(bankDetails.getAccno())
		bankRepository.deleteById(accno);
	}

}
