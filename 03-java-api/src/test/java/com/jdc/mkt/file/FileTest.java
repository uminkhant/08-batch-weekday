package com.jdc.mkt.file;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	void testMethodThree() {
		File file = new File("/Users/MKT/Desktop/test/testOne/hello.txt");
		file.setReadOnly();
		assertTrue(file.canRead());
		assertFalse(file.canWrite());
		assertFalse(file.isHidden());
		file.setWritable(true);
		assertTrue(file.canWrite());
		
	}
	// @Test
		void testMethodTwo() throws IOException {
			File path = new File("/Users/MKT/Desktop/test/testOne");
			path.mkdirs();
			assertTrue(path.isDirectory());
			File file = new File(path, "hello.txt");
			file.createNewFile();
			assertTrue(file.isFile());

			System.out.println("Name :" + file.getName());
			System.out.println("Parent :" + file.getParent());
			System.out.println("Absoulute path " + file.getAbsolutePath());

			// System.out.println(" "+file);

		}


	// @Test
	void testMethodOne() {
		try {
//			File path = new File("/Users/MKT/Desktop");
//			File file = new File(path,"hello.txt");

//		    File file = new File("/Users/MKT/Desktop/hello.txt");
			File file = new File("hello.txt");
			assertFalse(file.exists());
			file.createNewFile();
			assertTrue(file.exists());
//			file.deleteOnExit();
//			assertTrue(file.exists());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	
}
