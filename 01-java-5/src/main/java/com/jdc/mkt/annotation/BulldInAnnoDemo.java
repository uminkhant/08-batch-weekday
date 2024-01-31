package com.jdc.mkt.annotation;

import java.io.Serializable;

@SuppressWarnings({"serial","unused"})
public class BulldInAnnoDemo implements Serializable {

	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String name = "";
		
		doSomething();
		
	}
	
	@SafeVarargs
	static <T> T[] getNames(T...names) {
		return names;
	}
	@Deprecated
	static void doSomething() {}
}
