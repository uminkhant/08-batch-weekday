package com.jdc.mkt.abstraction;

public abstract class Animal {

	abstract void useWith();
}

class Lion extends Animal{

	@Override
	void useWith() {
		System.out.println("Lion is using with nails");
	}	
}

class Cat extends Animal{

	@Override
	void useWith() {
		System.out.println("Cat is using with nails");	
	}
	
}
