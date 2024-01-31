package com.jdc.mkt.string_test;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {

	String message = "Hello Java";
	
	//@Test
	void testOffset() {
		StringBuilder sb = new StringBuilder(message);
		sb.insert(5, "Dev");
		show(sb);
		sb.delete(1, 6);
		show(sb);
	}
	
	@Test
	//@Disabled
	void testStringBuilder() {
		StringBuilder sb = new StringBuilder(message);
		show(sb);
		sb.append(" Developer.");
		show(sb);
		sb.append("We Will");
		show(sb);		
		sb.replace(0, 5, "Hey");
		show(sb);
		sb.reverse();
		show(sb);
			
	}
	
	void show(StringBuilder sb) {
		System.out.println("Length : "+sb.length()+"\tCapcity : "+sb.capacity());
		System.out.println(sb);
	}
}



