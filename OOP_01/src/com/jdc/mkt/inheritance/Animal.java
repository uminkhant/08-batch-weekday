package com.jdc.mkt.inheritance;

public class Animal {

	protected void sleep(String n) {
		System.out.println("Sleep on somewhere !");
	}
	void eat(String value) {
		System.out.println("Eat "+ value);
	}
	void eat() {
		System.out.println("Eat something !");
	}
	
	 int getQty() {
		return 1;
	}
	
	D getObj() {
		return new D();
	}
}
