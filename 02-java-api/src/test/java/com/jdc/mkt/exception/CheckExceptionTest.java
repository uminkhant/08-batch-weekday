package com.jdc.mkt.exception;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CheckExceptionTest {

	@Test
	void testUnCheck() {
		try {
			int i = 100 / 0;
			System.out.println(i);
			
		} catch (ArithmeticException e) {
			
			System.out.println("exception");
		}
	}

	@Test
	@Disabled
	void testCheck() {

		try {
			File f = new File("/mkt/doucuments/test.txt");
			f.createNewFile();

		} catch (IOException e) {

		}
	}

}
