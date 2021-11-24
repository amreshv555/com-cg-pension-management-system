package com.cg.pension.management.system.demo.service;

import com.cg.pension.management.system.demo.entities.AbstractUser;

public interface IAbstractUserService {

	public AbstractUser register(AbstractUser abstractUser);
	
	public AbstractUser login(AbstractUser abstractUser);
}
