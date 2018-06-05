package com.demo.usercreditcard.api.exception;

/**
 * @author enes.acikoglu
 */
public abstract class UserCreditCardApiException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1256671219899520653L;

	public UserCreditCardApiException(String message) {
		super(message);
	}

	public UserCreditCardApiException(String message, Throwable cause) {
		super(message, cause);
	}
}
