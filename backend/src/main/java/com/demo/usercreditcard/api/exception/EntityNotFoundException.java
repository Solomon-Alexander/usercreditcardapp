package com.demo.usercreditcard.api.exception;

public class EntityNotFoundException extends UserCreditCardApiException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1595331078979818402L;

	public EntityNotFoundException(String message) {
		super(message);
	}

	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}