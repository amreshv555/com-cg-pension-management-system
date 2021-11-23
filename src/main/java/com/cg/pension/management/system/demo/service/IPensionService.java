package com.cg.pension.management.system.demo.service;

import com.cg.pension.management.system.demo.entities.PensionDetails;

public interface IPensionService {

	public PensionDetails addPensionDetails(PensionDetails pensionDetails);
	public PensionDetails updatePensionDetails(PensionDetails pensionDetails);
	public PensionDetails viewPensionDetails(PensionDetails pensionDetails);
	public void deletePensionDetails(int pensionerId);
}
