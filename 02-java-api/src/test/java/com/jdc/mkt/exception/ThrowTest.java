package com.jdc.mkt.exception;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

public class ThrowTest {

	@Test
	void testThrow() {
		callA();
	}

	private void callA() {
		try {
			callB();
		} catch (RuntimeException e) {
			System.out.println("runtime ");
		}
	}

	private void callB() {
		try {
			var writer = new PrintWriter(new File("/sss/", "ss"));
			writer.write("ss");
			writer.close();
			callC();
		} catch (IOException e) {
			throw new RuntimeException();
		}

	}

	private void callC() throws IOException {
		File f = new File("ss.txt");
		f.createNewFile();
	}
}
