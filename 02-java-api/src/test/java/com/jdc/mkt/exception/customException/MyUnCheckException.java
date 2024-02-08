package com.jdc.mkt.exception.customException;

@SuppressWarnings("serial")
public class MyUnCheckException extends RuntimeException{
	
	public MyUnCheckException() {
		super();
	}
	
	public MyUnCheckException(String message) {
		super(message);
	}
}
