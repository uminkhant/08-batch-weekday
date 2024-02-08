package com.jdc.mkt.exception.customException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

public class PersonTest {
	
	@Test
	void testPerson() {
		var person = setPerson();
		System.out.println(person.name() + "\t"+person.age());
	}

	private Person setPerson() {
		try(var reader = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Type name !");
			String name = reader.readLine();
			System.out.println("Type age !");
			String age = reader.readLine();
			
			if(null == name | name.isEmpty() | name.isBlank()) {
				throw new MyUnCheckException("Please type name !");
			}
			if(name.length() > 10) {
				throw new MyUnCheckException("Your name of length is greater than 10");
			}
			if(null == age | age.isEmpty()) {
				throw new MyUnCheckException("Please type age !");
			}
			
			return new Person(name,Integer.valueOf(age));
		
		}catch (IOException  | MyUnCheckException  | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	
}
