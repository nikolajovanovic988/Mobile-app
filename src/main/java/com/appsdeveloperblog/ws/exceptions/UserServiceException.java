package com.appsdeveloperblog.ws.exceptions;

public class UserServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2362323431250880182L;

	public UserServiceException (String message) {
		super(message);
	}
}
