package com.jdc.mkt.enum_test;

public class Main {
	
	public  void main() {
		
		String[]arr = {"Andrew","William","James"};
		setMessage(arr);
		
		setMessage("Andrew","William","James");
	}
	
	void setMessage(String... messages) {
		for(String s:messages) {
			System.out.println(s);
		}
	}
}
