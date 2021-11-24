package com.cg.pension.management.system.demo.exception;

public class BankDoesNotExistsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankDoesNotExistsException() {
		super();
		
	}

	public BankDoesNotExistsException(String message) {
		super(message);
		
	}
	
	

}
