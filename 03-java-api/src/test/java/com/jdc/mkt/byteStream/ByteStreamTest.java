package com.jdc.mkt.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ByteStreamTest {

	static File file;

	@ParameterizedTest
	@ValueSource(strings = { "Hi", "Hello Java" })
	void testReadWrite(String value) {
		try {
			createFile();
			writeValue(value);
			readValue();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private void createFile() throws IOException {
		file = new File("byte.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	private void writeValue(String value) throws IOException {
		var out = new FileOutputStream(file);
		char[] array = value.toCharArray();

		for (char c : array) {
			int i = c;
			out.write(i);
			
		}
		out.close();
	}

	private void readValue() throws IOException {
		var in = new FileInputStream(file);
		int i = 0;
		
		while (-1 != (i = in.read())) {
			char[] ar = Character.toChars(i);
			System.out.print(ar[0]);			
		}
		in.close();
		System.out.println();
		
	}
}
