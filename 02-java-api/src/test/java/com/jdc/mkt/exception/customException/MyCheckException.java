package com.jdc.mkt.exception.customException;

@SuppressWarnings("serial")
public class MyCheckException extends Exception {

	public MyCheckException() {
		super();
	}
	
	public MyCheckException(String message) {
		super(message);
	}
}
