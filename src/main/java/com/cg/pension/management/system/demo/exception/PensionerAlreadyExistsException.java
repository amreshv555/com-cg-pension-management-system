package com.cg.pension.management.system.demo.exception;

public class PensionerAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PensionerAlreadyExistsException() {
		super();
	}
	public PensionerAlreadyExistsException(String message) {
		super(message);
	}

}