package com.jdc.mkt.encapsulation.pkgOne;

public class Cat implements Feline{

	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void useNails() {
		System.out.println("use nails");
	}
	
	
}
