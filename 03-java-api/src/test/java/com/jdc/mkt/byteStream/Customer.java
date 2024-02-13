package com.jdc.mkt.byteStream;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	 private String email;
	private String password;
	private int age;
	
	public Customer(String email,String password,int age) {
		this.email = email;
		this.password = password;
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
