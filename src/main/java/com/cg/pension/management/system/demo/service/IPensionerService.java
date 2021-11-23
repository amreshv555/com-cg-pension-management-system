package com.cg.pension.management.system.demo.service;

import java.util.Optional;

import com.cg.pension.management.system.demo.entities.Pensioner;
import com.cg.pension.management.system.demo.exception.PensionerDoesNotExistsException;

public interface IPensionerService {

	public boolean validatePensioner();
	public Pensioner addPensioner(Pensioner pensioner);
	public void deletePensioner(int pensionerId) throws PensionerDoesNotExistsException;
	public Pensioner updatePensioner(Pensioner pensioner);
	public Optional<Pensioner> viewPensioner(int pensionerId);
}
