package com.cg.pension.management.system.demo.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pension.management.system.demo.entities.Pensioner;
import com.cg.pension.management.system.demo.exception.PensionerAlreadyExistsException;
import com.cg.pension.management.system.demo.exception.PensionerDoesNotExistsException;
//import com.cg.pension.management.system.demo.repository.IBankRepository;
import com.cg.pension.management.system.demo.repository.IPensionerRepository;

@Service
public class PensionerService implements IPensionerService{
	
	private static final Logger LOG = LoggerFactory.getLogger(PensionerService.class);
	
	@Autowired
	private IPensionerRepository pensionerRepository;
	
//	@Autowired
//	private IBankRepository bankRepository;

	@Override
	public boolean validatePensioner() {
		
		return false;
	}

	@Override
	public Pensioner addPensioner(Pensioner pensioner) {
		LOG.info("addPensioner");
		if (!pensionerRepository.existsById(pensioner.getPensionerid())) {
			LOG.info("Pensioner does not exist in the database and add successfully");
			return pensionerRepository.save(pensioner);
			}
		else {
			throw new PensionerAlreadyExistsException("This pensioner already exists in the database");
		}
	}

	@Override
	public void deletePensioner(int pensionerId) throws PensionerDoesNotExistsException {
		LOG.info("deletePensioner");
		Optional<Pensioner> penOpt = pensionerRepository.findById(pensionerId);
		if (penOpt.isPresent()) {
			LOG.info("Pensioner does exist in the database and deleted successfully");
			pensionerRepository.deleteById(pensionerId);
		} else {
			throw new PensionerDoesNotExistsException("This pensioner does not exists in the database");
		}

	}

	@Override
	public Pensioner updatePensioner(Pensioner pensioner) {
		LOG.info("updatePensioner");
		if (pensionerRepository.existsById(pensioner.getPensionerid())) {
			LOG.info("Pensioner does exist in the database and updated successfully");
			return pensionerRepository.save(pensioner);}
		else {
			throw new PensionerAlreadyExistsException("This pensioner already exists in the database");
		}
	}

	@Override
	public Optional<Pensioner> viewPensioner(int pensionerId) {
		Optional<Pensioner> penOpt = pensionerRepository.findById(pensionerId);
		if (penOpt.isPresent()) {
			return pensionerRepository.findById(pensionerId);
		}
		return Optional.empty();

	}


}
