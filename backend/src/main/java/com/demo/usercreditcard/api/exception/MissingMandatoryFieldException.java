package com.demo.usercreditcard.api.exception;

public class MissingMandatoryFieldException extends UserCreditCardApiException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1901236013226031468L;

	public MissingMandatoryFieldException(String message) {
		super(message);
	}

	public MissingMandatoryFieldException(String message, Throwable cause) {
		super(message, cause);
	}
}