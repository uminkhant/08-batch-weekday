package com.jdc.mkt.exception.customException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class CustomTest {

	//@Test
	void testCheck() {
		try {
			getNameCheck();
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void testUnCheck() {
		getNameUnCheck();
	}
	
	void getNameUnCheck() {
		try(var reader = new BufferedReader(new FileReader(new File("/sss/","test.txt")))){
			System.out.println("Type name !");
			String name = reader.readLine();
			System.out.println(name);
			
		}catch (IOException e) {
			throw new MyUnCheckException("This is uncheck exception");
		}
	}
	void getNameCheck() throws MyCheckException {
		try(var reader = new BufferedReader(new FileReader(new File("/sss/","test.txt")))){
			System.out.println("Type name !");
			String name = reader.readLine();
			System.out.println(name);
			
		}catch (IOException e) {
			throw new MyCheckException("This is check exception ");
			
		}
	}
}
