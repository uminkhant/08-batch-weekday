package com.jdc.mkt.interface_test;

public class MultipleInheritance {

	public static void main(String[] args) {
		 String message = "Hello";
		
		Human h = new Human() {		
			@Override
			public void doSomething() {
				System.out.println(message);
			}
		};
		//message = "Hi";
		h.doSomething();
	}
}

class Student extends Writer{

	@Override
	public void doSomething() {}}

abstract class Writer implements Human{}

class User implements Teacher,Admin {

	@Override
	public void eat() {
		Teacher.super.eat();
	}

	@Override
	public void doSomething() {	}
	
}

interface Human {
	void doSomething();
	default void eat() {
		System.out.println("Eat foods");
	}
}

interface Teacher extends Human{
	
	@Override
	default void eat() {
		System.out.println("Teacher : Eat foods ");
	}
}

interface Admin extends Human{
	@Override
	default void eat() {
		System.out.println("Student : Eat foods");
	}
}
