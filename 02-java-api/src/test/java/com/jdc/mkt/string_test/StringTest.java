package com.jdc.mkt.string_test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StringTest {
	String message = " hello java ";
	
	@Test
	void testOther() {
		System.out.println(message.length());
		System.out.println(message.trim().length());
		
		String[]array = message.split(" ");
		System.out.println(array.length);
		
		System.out.println("last index :" +array[0]);
		for(String s : array) {
			System.out.println(s);
		}
	}
	
	@Test
	@Disabled
	void testReplacing() {
		System.out.println(message.replace('a', 'o'));
		System.out.println(message.replaceAll("hello", "hell of"));
	}
	
	@Test
	@Disabled
	void testSubString() {
		System.out.println(message.substring(5));
		System.out.println(message.substring(1, 6));
		System.out.println(message.subSequence(1, 6));
	}
	
	@Test
	@Disabled
	void testCompare() {
		System.out.println(message.compareTo("hEllo java"));
		System.out.println(message.compareToIgnoreCase("Hello java"));
	}
	
	@Test 
	@Disabled
	void testCheck() {
		System.out.println(message.startsWith("he"));
		System.out.println(message.endsWith("a"));
		System.out.println(message.contains("j"));
		
		message = "";
		System.out.println(message.isBlank());
		System.out.println(message.isEmpty());
	}
	
	@Test
	@Disabled
	void testIndexOf() {
		System.out.println(message.indexOf("j"));
		System.out.println(message.lastIndexOf("H"));
		System.out.println(message.indexOf("j",5));
	}
	
}
