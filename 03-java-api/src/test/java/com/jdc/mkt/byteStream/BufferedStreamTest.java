package com.jdc.mkt.byteStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

public class BufferedStreamTest {

	File file;

	@Test
	void testReadAndWrite() {
		try {
			createFile();
			writeFile();
			readFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private void readFile() throws IOException {
		var reader = new BufferedReader(new FileReader(file));
		
		while(reader.ready()) {
			System.out.println(reader.readLine());
		}
		reader.close();
	}

	private void writeFile() throws IOException {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		var writer = new PrintWriter(file);
		String yes = "";
		do {
			System.out.println("Type Words !");
			String s = reader.readLine();
			writer.append(s);
			writer.append("\n");
			System.out.println("Again y/other");
			yes = reader.readLine();
			
		}while("y".equalsIgnoreCase(yes));
		writer.close();
		reader.close();
		
	}

	private void createFile() throws IOException {
		file = new File("buffer.txt");
		if (!file.exists())
			file.createNewFile();
	}
}
