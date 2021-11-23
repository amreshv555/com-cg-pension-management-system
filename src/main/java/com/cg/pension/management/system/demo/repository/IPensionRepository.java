package com.cg.pension.management.system.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pension.management.system.demo.entities.PensionDetails;

public interface IPensionRepository extends JpaRepository<PensionDetails, Integer>{
	
	public PensionDetails addPensionDetails(PensionDetails pensionDetails);
	public PensionDetails updatePensionDetails(PensionDetails pensionDetails);
	public PensionDetails viewPensionDetails(PensionDetails pensionDetails);
	public void deletePensionDetails(int pensionerId);
}

