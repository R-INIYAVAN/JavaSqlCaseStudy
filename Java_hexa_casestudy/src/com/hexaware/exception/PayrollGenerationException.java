package com.hexaware.exception;

public class PayrollGenerationException extends Exception{
	public PayrollGenerationException() {
		super();
	}
	
	public PayrollGenerationException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PayrollGenerationException(String message, Throwable cause) {
		super(message, cause);
	}

	public PayrollGenerationException(String message) {
		super(message);
	}

	public PayrollGenerationException(Throwable cause) {
		super(cause);
	}
}
