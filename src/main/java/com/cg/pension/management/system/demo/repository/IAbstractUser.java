package com.cg.pension.management.system.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pension.management.system.demo.entities.AbstractUser;

public interface IAbstractUser extends JpaRepository<AbstractUser, Integer>{
 

	public abstract AbstractUser findByUserName(String userName);

//	public AbstractUser addUser(AbstractUser user);
}
