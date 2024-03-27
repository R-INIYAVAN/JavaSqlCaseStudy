package com.hexaware.exception;

public class TaxCalculationException extends Exception{
	public TaxCalculationException() {
		super();
	}
	
	public TaxCalculationException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TaxCalculationException(String message, Throwable cause) {
		super(message, cause);
	}

	public TaxCalculationException(String message) {
		super(message);
	}

	public TaxCalculationException(Throwable cause) {
		super(cause);
	}
}
