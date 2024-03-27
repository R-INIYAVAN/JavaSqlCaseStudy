package com.hexaware.exception;

public class FinancialRecordException extends Exception{
	public FinancialRecordException() {
		super();
	}
	
	public FinancialRecordException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FinancialRecordException(String message, Throwable cause) {
		super(message, cause);
	}

	public FinancialRecordException(String message) {
		super(message);
	}

	public FinancialRecordException(Throwable cause) {
		super(cause);
	}
}
