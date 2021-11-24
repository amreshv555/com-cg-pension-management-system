package com.cg.pension.management.system.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pension.management.system.demo.entities.BankDetails;

public interface IBankRepository extends JpaRepository<BankDetails, Integer>{

	public abstract  BankDetails addBank(BankDetails bankDetails);
	public abstract void deleteBank(Long accno);
	
}
