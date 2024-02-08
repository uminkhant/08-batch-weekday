package com.jdc.mkt.exception;

import java.io.File;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		int i = setNumber("5p00");
		System.out.println(i);
		
	}
	
	@SuppressWarnings("unused")
	private static void setMessage(String message) {
		try(var writer = new PrintWriter(new File("test.txt"))){
			writer.write("ss");
			//writer.close();
			
		}catch (Exception e) {
			
		}
	}

	private static int setNumber(String num) {
		try {
			return Integer.valueOf(num);
			
		} catch (Exception e) {
			System.out.println("Number format exception");
		}
		finally {
			System.out.println("Using finally");
		}
		return 100;
	}
}
