package com.cg.pension.management.system.demo.exception;

public class AbstractUserAlreadyExistsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AbstractUserAlreadyExistsException() {
		super();
	}

	public AbstractUserAlreadyExistsException(String message) {
		super(message);
	}

}
