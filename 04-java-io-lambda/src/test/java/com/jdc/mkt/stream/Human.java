package com.jdc.mkt.stream;

public class Human {
	
	private String name;
	private int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	//@Override
	public int compareTo(Human h) {
		return name.compareTo(h.getName());
	}
	
	
}
