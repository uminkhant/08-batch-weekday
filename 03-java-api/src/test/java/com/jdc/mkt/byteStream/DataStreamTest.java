package com.jdc.mkt.byteStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DataStreamTest {

	File file;

	@ParameterizedTest
	@CsvSource(value = { "mkt@gmail.com:123mkt:23" }, delimiter = ':')
	void testReadWrite(String email, String password, byte age) {
		createFile();
		
		try (var writer = new DataOutputStream(new FileOutputStream(file));
				var reader = new DataInputStream(new FileInputStream(file))) {

			writer.writeUTF(email);
			writer.writeUTF(password);
			writer.writeByte(age);

			System.out.println(reader.readUTF());
			System.out.println(reader.readUTF());
			System.out.println(reader.readByte());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void createFile() {
		try {
			file = new File("data.dat");
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
