package com.cg.pension.management.system.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pension.management.system.demo.entities.Pensioner;

public interface IPensionerRepository extends JpaRepository<Pensioner, Integer> {
	
	public abstract boolean validatePensioner();
	public abstract  Pensioner addPensioner(Pensioner pensioner);
	public abstract void deletePensioner(int pensionerId);
	public abstract Pensioner updatePensioner(Pensioner pensioner);
	public  abstract Pensioner viewPensioner(int pensionerId);
}


