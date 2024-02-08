package com.jdc.mkt.byteStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CharacterStreamTest {

	File file;

	@ParameterizedTest
	@ValueSource(strings = "Hello Java")
	void testReadAndWrite(String data) {
		try {
			createFile();
			writeFile(data);
			readFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private void readFile() throws IOException {
		var read = new FileReader(file);
		int i = 0 ;
		
		while(-1 != (i = read.read())) {
			char c = Character.toChars(i)[0];
			System.out.print(c);
		}
		read.close();
	}
	

	private void writeFile(String data) throws IOException {
		var fw = new FileWriter(file);
		fw.write(data);
		fw.append(" Developer.");
		fw.close();
	}

	private void createFile() throws IOException {
		file = new File("character.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
	}
}
