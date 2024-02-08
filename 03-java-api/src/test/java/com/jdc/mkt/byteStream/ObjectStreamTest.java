package com.jdc.mkt.byteStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ObjectStreamTest {

	File file;

	@ParameterizedTest
	@CsvSource(value = { "mkt@gmail.com:123mkt:23" }, delimiter = ':')
	void testReadWrite(String email, String password, byte age) {
		createFile();
		var customer = new Customer(email, password,age);
		
		try (var writer = new ObjectOutputStream(new FileOutputStream(file));
				var reader = new ObjectInputStream(new FileInputStream(file))) {

			writer.writeObject(customer);			
			customer = (Customer) reader.readObject();
			
			System.out.println(customer.getEmail()+"\t"+customer.getPassword()+"\t"+customer.getAge());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void createFile() {
		try {
			file = new File("object.obj");
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
