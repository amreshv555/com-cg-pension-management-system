package com.cg.pension.management.system.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.pension.management.system.demo.entities.AbstractUser;
import com.cg.pension.management.system.demo.exception.AbsrtactUserNotFoundException;
import com.cg.pension.management.system.demo.exception.AbstractUserAlreadyExistsException;
import com.cg.pension.management.system.demo.repository.IAbstractUser;

public class AbstractUserService implements IAbstractUserService{

	public boolean isLoggedIn;

	private AbstractUser tempUser;

	private static final Logger LOG = LoggerFactory.getLogger(AbstractUserService.class);

	@Autowired
	IAbstractUser abstractUserRepository;
    
	@Override
	public AbstractUser register(AbstractUser abstractUser) {
		LOG.info("register");
		if (abstractUserRepository.findByUserName(abstractUser.getUserName()).getUserName()
				.equalsIgnoreCase(abstractUser.getUserName()))
			throw new AbstractUserAlreadyExistsException();
		return abstractUserRepository.save(abstractUser);
	}

	@Override
	public AbstractUser login(AbstractUser abstractUser) {
		LOG.info("login");
		tempUser = abstractUserRepository.findByUserName(abstractUser.getUserName());
		if (tempUser.getUserName().equalsIgnoreCase(abstractUser.getUserName())) {
			isLoggedIn = true;
			return tempUser;
		}
		throw new AbsrtactUserNotFoundException();
	}

	public String logout(String userName) {
		LOG.info("logout");
		if (isLoggedIn) {
			isLoggedIn = false;
			return "User logged out successfully.";
		}
		throw new AbsrtactUserNotFoundException();
	}

}
